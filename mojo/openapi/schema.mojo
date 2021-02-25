/// The Schema Object allows the definition of input and output data types. These types can be objects, but also primitives and arrays. This object is an extended subset of the JSON Schema Specification Wright Draft 00.
///
/// For more information about the properties, see JSON Schema Core and JSON Schema Validation. Unless stated otherwise, the property definitions follow the JSON Schema.
type Schema {
    enum Type {
        integer
        number
        string
        boolean

        array //<  An ordered list of instances, from the JSON "array" production
        object //< An unordered set of properties mapping a string to an instance, from the JSON "object" production
    }

    /// The following properties are taken directly from the JSON Schema definition and follow the same specifications
    {
        title: String

        description: String //< support GFM

        /// Value MUST be a string. Multiple types via an array are not supported.
        type: Type

        /// format is an open string-valued property,
        /// and can have any value. Formats such as "email", "uuid", and so on,
        /// MAY be used even though undefined by this specification.
        /// Types that are not accompanied by a format property follow the type definition in the JSON Schema.
        /// Tools that do not recognize a specific format MAY default back to the type alone, as if the format is not specified.
        format: String

        /// The value of "multipleOf" MUST be a number, strictly greater than 0.
        ///
        /// A numeric instance is valid only if division by this keyword's value results in an integer.
        multiple_of: Int @minimum(1)

        maximum: Number
        exclusive_maximum: Number

        minimum: Number
        exclusive_minimum: Number

        max_length: UInt

        /// A string instance is valid against this keyword if its length is greater than, or equal to, the value of this keyword.
        /// The length of a string instance is defined as the number of its characters as defined by RFC 7159.
        /// Omitting this keyword has the same behavior as a value of 0.
        min_length: UInt

        pattern: Regex

        /// Value MUST be an object and not an array. Inline or referenced schema MUST be of a Schema Object and not a standard JSON Schema. items MUST be present if the type is array.
        items: Schema

        max_items: UInt
        
        min_items: UInt @default(0)
        
        unique_items: Bool @default(false)

        properties: {String, Schema}

        additional_properties: {String, Schema}

        max_properties: UInt

        min_properties: UInt @default(0)
        
        required: [String] @unique

        enum: [Any] @unique @nonempty
    
        /// Inline or referenced schema MUST be of a Schema Object and not a standard JSON Schema.
        /// validates the value against all the subschemas
        all_of: [Referenceable<Schema>] @nonempty

        /// validates the value against exactly one of the subschemas
        one_of: [Referenceable<Schema>]

        /// validates the value against any (one or more) of the subschemas
        any_of: [Referenceable<Schema>]

        /// make sure the value is not valid against the specified schema.
        not: Referenceable<Schema>

        default: Any
    }

    /// Allows sending a null value for the defined schema. Default value is false.
    nullable: Bool = false
    
    /// Adds support for polymorphism. The discriminator is an object name that is used to differentiate between other schemas which may satisfy the payload description. See Composition and Inheritance for more details.
    discriminator: Discriminator

    /// Relevant only for Schema "properties" definitions. Declares the property as "read only". This means that it MAY be sent as part of a response but SHOULD NOT be sent as part of the request. If the property is marked as readOnly being true and is in the required list, the required will take effect on the response only. A property MUST NOT be marked as both readOnly and writeOnly being true. Default value is false.
    read_only: Bool

    /// Relevant only for Schema "properties" definitions. Declares the property as "write only". Therefore, it MAY be sent as part of a request but SHOULD NOT be sent as part of the response. If the property is marked as writeOnly being true and is in the required list, the required will take effect on the request only. A property MUST NOT be marked as both readOnly and writeOnly being true. Default value is false.
    write_only: Bool

    /// This MAY be used only on properties schemas. It has no effect on root schemas. Adds additional metadata to describe the XML representation of this property.
    xml: Xml

    /// Additional external documentation for this schema.
    external_docs: ExternalDocument

    /// A free-form property to include an example of an instance for this schema. To represent examples that cannot be naturally represented in JSON or YAML, a string value can be used to contain the example with escaping where necessary.
    example: Any

    /// Specifies that a schema is deprecated and SHOULD be transitioned out of usage. Default value is false.
    deprecated: Bool = false
}