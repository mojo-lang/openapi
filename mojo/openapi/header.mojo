/// The Header Object follows the structure of the Parameter Object with the following changes:
/// 1. name MUST NOT be specified, it is given in the corresponding headers map.
/// 1. in MUST NOT be specified, it is implicitly in header.
/// 1. All traits that are affected by the location MUST be applicable to a location of header (for example, style).
/// @example({
///    description: "The number of allowed requests in the current period"
///    schema: {
///        type: integer
///    }
///})
type Header : Parameter @ignore_fields('name', 'in')