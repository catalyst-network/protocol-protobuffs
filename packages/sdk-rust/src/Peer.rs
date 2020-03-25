// This file is generated by rust-protobuf 2.10.1. Do not edit
// @generated

// https://github.com/rust-lang/rust-clippy/issues/702
#![allow(unknown_lints)]
#![allow(clippy::all)]

#![cfg_attr(rustfmt, rustfmt_skip)]

#![allow(box_pointers)]
#![allow(dead_code)]
#![allow(missing_docs)]
#![allow(non_camel_case_types)]
#![allow(non_snake_case)]
#![allow(non_upper_case_globals)]
#![allow(trivial_casts)]
#![allow(unsafe_code)]
#![allow(unused_imports)]
#![allow(unused_results)]
//! Generated file from `Peer.proto`

use protobuf::Message as Message_imported_for_functions;
use protobuf::ProtobufEnum as ProtobufEnum_imported_for_functions;

/// Generated files are compatible only with the same version
/// of protobuf runtime.
// const _PROTOBUF_VERSION_CHECK: () = ::protobuf::VERSION_2_10_1;

#[derive(PartialEq,Clone,Default)]
pub struct PeerId {
    // message fields
    pub ip: ::std::vec::Vec<u8>,
    pub port: u32,
    pub public_key: ::std::vec::Vec<u8>,
    // special fields
    pub unknown_fields: ::protobuf::UnknownFields,
    pub cached_size: ::protobuf::CachedSize,
}

impl<'a> ::std::default::Default for &'a PeerId {
    fn default() -> &'a PeerId {
        <PeerId as ::protobuf::Message>::default_instance()
    }
}

impl PeerId {
    pub fn new() -> PeerId {
        ::std::default::Default::default()
    }

    // bytes ip = 1;


    pub fn get_ip(&self) -> &[u8] {
        &self.ip
    }
    pub fn clear_ip(&mut self) {
        self.ip.clear();
    }

    // Param is passed by value, moved
    pub fn set_ip(&mut self, v: ::std::vec::Vec<u8>) {
        self.ip = v;
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_ip(&mut self) -> &mut ::std::vec::Vec<u8> {
        &mut self.ip
    }

    // Take field
    pub fn take_ip(&mut self) -> ::std::vec::Vec<u8> {
        ::std::mem::replace(&mut self.ip, ::std::vec::Vec::new())
    }

    // uint32 port = 2;


    pub fn get_port(&self) -> u32 {
        self.port
    }
    pub fn clear_port(&mut self) {
        self.port = 0;
    }

    // Param is passed by value, moved
    pub fn set_port(&mut self, v: u32) {
        self.port = v;
    }

    // bytes public_key = 3;


    pub fn get_public_key(&self) -> &[u8] {
        &self.public_key
    }
    pub fn clear_public_key(&mut self) {
        self.public_key.clear();
    }

    // Param is passed by value, moved
    pub fn set_public_key(&mut self, v: ::std::vec::Vec<u8>) {
        self.public_key = v;
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_public_key(&mut self) -> &mut ::std::vec::Vec<u8> {
        &mut self.public_key
    }

    // Take field
    pub fn take_public_key(&mut self) -> ::std::vec::Vec<u8> {
        ::std::mem::replace(&mut self.public_key, ::std::vec::Vec::new())
    }
}

impl ::protobuf::Message for PeerId {
    fn is_initialized(&self) -> bool {
        true
    }

    fn merge_from(&mut self, is: &mut ::protobuf::CodedInputStream<'_>) -> ::protobuf::ProtobufResult<()> {
        while !is.eof()? {
            let (field_number, wire_type) = is.read_tag_unpack()?;
            match field_number {
                1 => {
                    ::protobuf::rt::read_singular_proto3_bytes_into(wire_type, is, &mut self.ip)?;
                },
                2 => {
                    if wire_type != ::protobuf::wire_format::WireTypeVarint {
                        return ::std::result::Result::Err(::protobuf::rt::unexpected_wire_type(wire_type));
                    }
                    let tmp = is.read_uint32()?;
                    self.port = tmp;
                },
                3 => {
                    ::protobuf::rt::read_singular_proto3_bytes_into(wire_type, is, &mut self.public_key)?;
                },
                _ => {
                    ::protobuf::rt::read_unknown_or_skip_group(field_number, wire_type, is, self.mut_unknown_fields())?;
                },
            };
        }
        ::std::result::Result::Ok(())
    }

    // Compute sizes of nested messages
    #[allow(unused_variables)]
    fn compute_size(&self) -> u32 {
        let mut my_size = 0;
        if !self.ip.is_empty() {
            my_size += ::protobuf::rt::bytes_size(1, &self.ip);
        }
        if self.port != 0 {
            my_size += ::protobuf::rt::value_size(2, self.port, ::protobuf::wire_format::WireTypeVarint);
        }
        if !self.public_key.is_empty() {
            my_size += ::protobuf::rt::bytes_size(3, &self.public_key);
        }
        my_size += ::protobuf::rt::unknown_fields_size(self.get_unknown_fields());
        self.cached_size.set(my_size);
        my_size
    }

    fn write_to_with_cached_sizes(&self, os: &mut ::protobuf::CodedOutputStream<'_>) -> ::protobuf::ProtobufResult<()> {
        if !self.ip.is_empty() {
            os.write_bytes(1, &self.ip)?;
        }
        if self.port != 0 {
            os.write_uint32(2, self.port)?;
        }
        if !self.public_key.is_empty() {
            os.write_bytes(3, &self.public_key)?;
        }
        os.write_unknown_fields(self.get_unknown_fields())?;
        ::std::result::Result::Ok(())
    }

    fn get_cached_size(&self) -> u32 {
        self.cached_size.get()
    }

    fn get_unknown_fields(&self) -> &::protobuf::UnknownFields {
        &self.unknown_fields
    }

    fn mut_unknown_fields(&mut self) -> &mut ::protobuf::UnknownFields {
        &mut self.unknown_fields
    }

    fn as_any(&self) -> &dyn (::std::any::Any) {
        self as &dyn (::std::any::Any)
    }
    fn as_any_mut(&mut self) -> &mut dyn (::std::any::Any) {
        self as &mut dyn (::std::any::Any)
    }
    fn into_any(self: Box<Self>) -> ::std::boxed::Box<dyn (::std::any::Any)> {
        self
    }

    fn descriptor(&self) -> &'static ::protobuf::reflect::MessageDescriptor {
        Self::descriptor_static()
    }

    fn new() -> PeerId {
        PeerId::new()
    }

    fn descriptor_static() -> &'static ::protobuf::reflect::MessageDescriptor {
        static mut descriptor: ::protobuf::lazy::Lazy<::protobuf::reflect::MessageDescriptor> = ::protobuf::lazy::Lazy {
            lock: ::protobuf::lazy::ONCE_INIT,
            ptr: 0 as *const ::protobuf::reflect::MessageDescriptor,
        };
        unsafe {
            descriptor.get(|| {
                let mut fields = ::std::vec::Vec::new();
                fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeBytes>(
                    "ip",
                    |m: &PeerId| { &m.ip },
                    |m: &mut PeerId| { &mut m.ip },
                ));
                fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeUint32>(
                    "port",
                    |m: &PeerId| { &m.port },
                    |m: &mut PeerId| { &mut m.port },
                ));
                fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeBytes>(
                    "public_key",
                    |m: &PeerId| { &m.public_key },
                    |m: &mut PeerId| { &mut m.public_key },
                ));
                ::protobuf::reflect::MessageDescriptor::new::<PeerId>(
                    "PeerId",
                    fields,
                    file_descriptor_proto()
                )
            })
        }
    }

    fn default_instance() -> &'static PeerId {
        static mut instance: ::protobuf::lazy::Lazy<PeerId> = ::protobuf::lazy::Lazy {
            lock: ::protobuf::lazy::ONCE_INIT,
            ptr: 0 as *const PeerId,
        };
        unsafe {
            instance.get(PeerId::new)
        }
    }
}

impl ::protobuf::Clear for PeerId {
    fn clear(&mut self) {
        self.ip.clear();
        self.port = 0;
        self.public_key.clear();
        self.unknown_fields.clear();
    }
}

impl ::std::fmt::Debug for PeerId {
    fn fmt(&self, f: &mut ::std::fmt::Formatter<'_>) -> ::std::fmt::Result {
        ::protobuf::text_format::fmt(self, f)
    }
}

impl ::protobuf::reflect::ProtobufValue for PeerId {
    fn as_ref(&self) -> ::protobuf::reflect::ProtobufValueRef {
        ::protobuf::reflect::ProtobufValueRef::Message(self)
    }
}

#[derive(PartialEq,Clone,Default)]
pub struct PeerInfo {
    // message fields
    pub peer_id: ::protobuf::SingularPtrField<PeerId>,
    pub reputation: i32,
    pub is_blacklisted: bool,
    pub is_unreachable: bool,
    pub inactive_for: ::protobuf::SingularPtrField<::protobuf::well_known_types::Duration>,
    pub last_seen: ::protobuf::SingularPtrField<::protobuf::well_known_types::Timestamp>,
    pub modified: ::protobuf::SingularPtrField<::protobuf::well_known_types::Timestamp>,
    pub created: ::protobuf::SingularPtrField<::protobuf::well_known_types::Timestamp>,
    // special fields
    pub unknown_fields: ::protobuf::UnknownFields,
    pub cached_size: ::protobuf::CachedSize,
}

impl<'a> ::std::default::Default for &'a PeerInfo {
    fn default() -> &'a PeerInfo {
        <PeerInfo as ::protobuf::Message>::default_instance()
    }
}

impl PeerInfo {
    pub fn new() -> PeerInfo {
        ::std::default::Default::default()
    }

    // .Catalyst.Protocol.Peer.PeerId peer_id = 1;


    pub fn get_peer_id(&self) -> &PeerId {
        self.peer_id.as_ref().unwrap_or_else(|| PeerId::default_instance())
    }
    pub fn clear_peer_id(&mut self) {
        self.peer_id.clear();
    }

    pub fn has_peer_id(&self) -> bool {
        self.peer_id.is_some()
    }

    // Param is passed by value, moved
    pub fn set_peer_id(&mut self, v: PeerId) {
        self.peer_id = ::protobuf::SingularPtrField::some(v);
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_peer_id(&mut self) -> &mut PeerId {
        if self.peer_id.is_none() {
            self.peer_id.set_default();
        }
        self.peer_id.as_mut().unwrap()
    }

    // Take field
    pub fn take_peer_id(&mut self) -> PeerId {
        self.peer_id.take().unwrap_or_else(|| PeerId::new())
    }

    // sint32 reputation = 2;


    pub fn get_reputation(&self) -> i32 {
        self.reputation
    }
    pub fn clear_reputation(&mut self) {
        self.reputation = 0;
    }

    // Param is passed by value, moved
    pub fn set_reputation(&mut self, v: i32) {
        self.reputation = v;
    }

    // bool is_blacklisted = 3;


    pub fn get_is_blacklisted(&self) -> bool {
        self.is_blacklisted
    }
    pub fn clear_is_blacklisted(&mut self) {
        self.is_blacklisted = false;
    }

    // Param is passed by value, moved
    pub fn set_is_blacklisted(&mut self, v: bool) {
        self.is_blacklisted = v;
    }

    // bool is_unreachable = 4;


    pub fn get_is_unreachable(&self) -> bool {
        self.is_unreachable
    }
    pub fn clear_is_unreachable(&mut self) {
        self.is_unreachable = false;
    }

    // Param is passed by value, moved
    pub fn set_is_unreachable(&mut self, v: bool) {
        self.is_unreachable = v;
    }

    // .google.protobuf.Duration inactive_for = 5;


    pub fn get_inactive_for(&self) -> &::protobuf::well_known_types::Duration {
        self.inactive_for.as_ref().unwrap_or_else(|| ::protobuf::well_known_types::Duration::default_instance())
    }
    pub fn clear_inactive_for(&mut self) {
        self.inactive_for.clear();
    }

    pub fn has_inactive_for(&self) -> bool {
        self.inactive_for.is_some()
    }

    // Param is passed by value, moved
    pub fn set_inactive_for(&mut self, v: ::protobuf::well_known_types::Duration) {
        self.inactive_for = ::protobuf::SingularPtrField::some(v);
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_inactive_for(&mut self) -> &mut ::protobuf::well_known_types::Duration {
        if self.inactive_for.is_none() {
            self.inactive_for.set_default();
        }
        self.inactive_for.as_mut().unwrap()
    }

    // Take field
    pub fn take_inactive_for(&mut self) -> ::protobuf::well_known_types::Duration {
        self.inactive_for.take().unwrap_or_else(|| ::protobuf::well_known_types::Duration::new())
    }

    // .google.protobuf.Timestamp last_seen = 6;


    pub fn get_last_seen(&self) -> &::protobuf::well_known_types::Timestamp {
        self.last_seen.as_ref().unwrap_or_else(|| ::protobuf::well_known_types::Timestamp::default_instance())
    }
    pub fn clear_last_seen(&mut self) {
        self.last_seen.clear();
    }

    pub fn has_last_seen(&self) -> bool {
        self.last_seen.is_some()
    }

    // Param is passed by value, moved
    pub fn set_last_seen(&mut self, v: ::protobuf::well_known_types::Timestamp) {
        self.last_seen = ::protobuf::SingularPtrField::some(v);
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_last_seen(&mut self) -> &mut ::protobuf::well_known_types::Timestamp {
        if self.last_seen.is_none() {
            self.last_seen.set_default();
        }
        self.last_seen.as_mut().unwrap()
    }

    // Take field
    pub fn take_last_seen(&mut self) -> ::protobuf::well_known_types::Timestamp {
        self.last_seen.take().unwrap_or_else(|| ::protobuf::well_known_types::Timestamp::new())
    }

    // .google.protobuf.Timestamp modified = 7;


    pub fn get_modified(&self) -> &::protobuf::well_known_types::Timestamp {
        self.modified.as_ref().unwrap_or_else(|| ::protobuf::well_known_types::Timestamp::default_instance())
    }
    pub fn clear_modified(&mut self) {
        self.modified.clear();
    }

    pub fn has_modified(&self) -> bool {
        self.modified.is_some()
    }

    // Param is passed by value, moved
    pub fn set_modified(&mut self, v: ::protobuf::well_known_types::Timestamp) {
        self.modified = ::protobuf::SingularPtrField::some(v);
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_modified(&mut self) -> &mut ::protobuf::well_known_types::Timestamp {
        if self.modified.is_none() {
            self.modified.set_default();
        }
        self.modified.as_mut().unwrap()
    }

    // Take field
    pub fn take_modified(&mut self) -> ::protobuf::well_known_types::Timestamp {
        self.modified.take().unwrap_or_else(|| ::protobuf::well_known_types::Timestamp::new())
    }

    // .google.protobuf.Timestamp created = 8;


    pub fn get_created(&self) -> &::protobuf::well_known_types::Timestamp {
        self.created.as_ref().unwrap_or_else(|| ::protobuf::well_known_types::Timestamp::default_instance())
    }
    pub fn clear_created(&mut self) {
        self.created.clear();
    }

    pub fn has_created(&self) -> bool {
        self.created.is_some()
    }

    // Param is passed by value, moved
    pub fn set_created(&mut self, v: ::protobuf::well_known_types::Timestamp) {
        self.created = ::protobuf::SingularPtrField::some(v);
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_created(&mut self) -> &mut ::protobuf::well_known_types::Timestamp {
        if self.created.is_none() {
            self.created.set_default();
        }
        self.created.as_mut().unwrap()
    }

    // Take field
    pub fn take_created(&mut self) -> ::protobuf::well_known_types::Timestamp {
        self.created.take().unwrap_or_else(|| ::protobuf::well_known_types::Timestamp::new())
    }
}

impl ::protobuf::Message for PeerInfo {
    fn is_initialized(&self) -> bool {
        for v in &self.peer_id {
            if !v.is_initialized() {
                return false;
            }
        };
        for v in &self.inactive_for {
            if !v.is_initialized() {
                return false;
            }
        };
        for v in &self.last_seen {
            if !v.is_initialized() {
                return false;
            }
        };
        for v in &self.modified {
            if !v.is_initialized() {
                return false;
            }
        };
        for v in &self.created {
            if !v.is_initialized() {
                return false;
            }
        };
        true
    }

    fn merge_from(&mut self, is: &mut ::protobuf::CodedInputStream<'_>) -> ::protobuf::ProtobufResult<()> {
        while !is.eof()? {
            let (field_number, wire_type) = is.read_tag_unpack()?;
            match field_number {
                1 => {
                    ::protobuf::rt::read_singular_message_into(wire_type, is, &mut self.peer_id)?;
                },
                2 => {
                    if wire_type != ::protobuf::wire_format::WireTypeVarint {
                        return ::std::result::Result::Err(::protobuf::rt::unexpected_wire_type(wire_type));
                    }
                    let tmp = is.read_sint32()?;
                    self.reputation = tmp;
                },
                3 => {
                    if wire_type != ::protobuf::wire_format::WireTypeVarint {
                        return ::std::result::Result::Err(::protobuf::rt::unexpected_wire_type(wire_type));
                    }
                    let tmp = is.read_bool()?;
                    self.is_blacklisted = tmp;
                },
                4 => {
                    if wire_type != ::protobuf::wire_format::WireTypeVarint {
                        return ::std::result::Result::Err(::protobuf::rt::unexpected_wire_type(wire_type));
                    }
                    let tmp = is.read_bool()?;
                    self.is_unreachable = tmp;
                },
                5 => {
                    ::protobuf::rt::read_singular_message_into(wire_type, is, &mut self.inactive_for)?;
                },
                6 => {
                    ::protobuf::rt::read_singular_message_into(wire_type, is, &mut self.last_seen)?;
                },
                7 => {
                    ::protobuf::rt::read_singular_message_into(wire_type, is, &mut self.modified)?;
                },
                8 => {
                    ::protobuf::rt::read_singular_message_into(wire_type, is, &mut self.created)?;
                },
                _ => {
                    ::protobuf::rt::read_unknown_or_skip_group(field_number, wire_type, is, self.mut_unknown_fields())?;
                },
            };
        }
        ::std::result::Result::Ok(())
    }

    // Compute sizes of nested messages
    #[allow(unused_variables)]
    fn compute_size(&self) -> u32 {
        let mut my_size = 0;
        if let Some(ref v) = self.peer_id.as_ref() {
            let len = v.compute_size();
            my_size += 1 + ::protobuf::rt::compute_raw_varint32_size(len) + len;
        }
        if self.reputation != 0 {
            my_size += ::protobuf::rt::value_varint_zigzag_size(2, self.reputation);
        }
        if self.is_blacklisted != false {
            my_size += 2;
        }
        if self.is_unreachable != false {
            my_size += 2;
        }
        if let Some(ref v) = self.inactive_for.as_ref() {
            let len = v.compute_size();
            my_size += 1 + ::protobuf::rt::compute_raw_varint32_size(len) + len;
        }
        if let Some(ref v) = self.last_seen.as_ref() {
            let len = v.compute_size();
            my_size += 1 + ::protobuf::rt::compute_raw_varint32_size(len) + len;
        }
        if let Some(ref v) = self.modified.as_ref() {
            let len = v.compute_size();
            my_size += 1 + ::protobuf::rt::compute_raw_varint32_size(len) + len;
        }
        if let Some(ref v) = self.created.as_ref() {
            let len = v.compute_size();
            my_size += 1 + ::protobuf::rt::compute_raw_varint32_size(len) + len;
        }
        my_size += ::protobuf::rt::unknown_fields_size(self.get_unknown_fields());
        self.cached_size.set(my_size);
        my_size
    }

    fn write_to_with_cached_sizes(&self, os: &mut ::protobuf::CodedOutputStream<'_>) -> ::protobuf::ProtobufResult<()> {
        if let Some(ref v) = self.peer_id.as_ref() {
            os.write_tag(1, ::protobuf::wire_format::WireTypeLengthDelimited)?;
            os.write_raw_varint32(v.get_cached_size())?;
            v.write_to_with_cached_sizes(os)?;
        }
        if self.reputation != 0 {
            os.write_sint32(2, self.reputation)?;
        }
        if self.is_blacklisted != false {
            os.write_bool(3, self.is_blacklisted)?;
        }
        if self.is_unreachable != false {
            os.write_bool(4, self.is_unreachable)?;
        }
        if let Some(ref v) = self.inactive_for.as_ref() {
            os.write_tag(5, ::protobuf::wire_format::WireTypeLengthDelimited)?;
            os.write_raw_varint32(v.get_cached_size())?;
            v.write_to_with_cached_sizes(os)?;
        }
        if let Some(ref v) = self.last_seen.as_ref() {
            os.write_tag(6, ::protobuf::wire_format::WireTypeLengthDelimited)?;
            os.write_raw_varint32(v.get_cached_size())?;
            v.write_to_with_cached_sizes(os)?;
        }
        if let Some(ref v) = self.modified.as_ref() {
            os.write_tag(7, ::protobuf::wire_format::WireTypeLengthDelimited)?;
            os.write_raw_varint32(v.get_cached_size())?;
            v.write_to_with_cached_sizes(os)?;
        }
        if let Some(ref v) = self.created.as_ref() {
            os.write_tag(8, ::protobuf::wire_format::WireTypeLengthDelimited)?;
            os.write_raw_varint32(v.get_cached_size())?;
            v.write_to_with_cached_sizes(os)?;
        }
        os.write_unknown_fields(self.get_unknown_fields())?;
        ::std::result::Result::Ok(())
    }

    fn get_cached_size(&self) -> u32 {
        self.cached_size.get()
    }

    fn get_unknown_fields(&self) -> &::protobuf::UnknownFields {
        &self.unknown_fields
    }

    fn mut_unknown_fields(&mut self) -> &mut ::protobuf::UnknownFields {
        &mut self.unknown_fields
    }

    fn as_any(&self) -> &dyn (::std::any::Any) {
        self as &dyn (::std::any::Any)
    }
    fn as_any_mut(&mut self) -> &mut dyn (::std::any::Any) {
        self as &mut dyn (::std::any::Any)
    }
    fn into_any(self: Box<Self>) -> ::std::boxed::Box<dyn (::std::any::Any)> {
        self
    }

    fn descriptor(&self) -> &'static ::protobuf::reflect::MessageDescriptor {
        Self::descriptor_static()
    }

    fn new() -> PeerInfo {
        PeerInfo::new()
    }

    fn descriptor_static() -> &'static ::protobuf::reflect::MessageDescriptor {
        static mut descriptor: ::protobuf::lazy::Lazy<::protobuf::reflect::MessageDescriptor> = ::protobuf::lazy::Lazy {
            lock: ::protobuf::lazy::ONCE_INIT,
            ptr: 0 as *const ::protobuf::reflect::MessageDescriptor,
        };
        unsafe {
            descriptor.get(|| {
                let mut fields = ::std::vec::Vec::new();
                fields.push(::protobuf::reflect::accessor::make_singular_ptr_field_accessor::<_, ::protobuf::types::ProtobufTypeMessage<PeerId>>(
                    "peer_id",
                    |m: &PeerInfo| { &m.peer_id },
                    |m: &mut PeerInfo| { &mut m.peer_id },
                ));
                fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeSint32>(
                    "reputation",
                    |m: &PeerInfo| { &m.reputation },
                    |m: &mut PeerInfo| { &mut m.reputation },
                ));
                fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeBool>(
                    "is_blacklisted",
                    |m: &PeerInfo| { &m.is_blacklisted },
                    |m: &mut PeerInfo| { &mut m.is_blacklisted },
                ));
                fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeBool>(
                    "is_unreachable",
                    |m: &PeerInfo| { &m.is_unreachable },
                    |m: &mut PeerInfo| { &mut m.is_unreachable },
                ));
                fields.push(::protobuf::reflect::accessor::make_singular_ptr_field_accessor::<_, ::protobuf::types::ProtobufTypeMessage<::protobuf::well_known_types::Duration>>(
                    "inactive_for",
                    |m: &PeerInfo| { &m.inactive_for },
                    |m: &mut PeerInfo| { &mut m.inactive_for },
                ));
                fields.push(::protobuf::reflect::accessor::make_singular_ptr_field_accessor::<_, ::protobuf::types::ProtobufTypeMessage<::protobuf::well_known_types::Timestamp>>(
                    "last_seen",
                    |m: &PeerInfo| { &m.last_seen },
                    |m: &mut PeerInfo| { &mut m.last_seen },
                ));
                fields.push(::protobuf::reflect::accessor::make_singular_ptr_field_accessor::<_, ::protobuf::types::ProtobufTypeMessage<::protobuf::well_known_types::Timestamp>>(
                    "modified",
                    |m: &PeerInfo| { &m.modified },
                    |m: &mut PeerInfo| { &mut m.modified },
                ));
                fields.push(::protobuf::reflect::accessor::make_singular_ptr_field_accessor::<_, ::protobuf::types::ProtobufTypeMessage<::protobuf::well_known_types::Timestamp>>(
                    "created",
                    |m: &PeerInfo| { &m.created },
                    |m: &mut PeerInfo| { &mut m.created },
                ));
                ::protobuf::reflect::MessageDescriptor::new::<PeerInfo>(
                    "PeerInfo",
                    fields,
                    file_descriptor_proto()
                )
            })
        }
    }

    fn default_instance() -> &'static PeerInfo {
        static mut instance: ::protobuf::lazy::Lazy<PeerInfo> = ::protobuf::lazy::Lazy {
            lock: ::protobuf::lazy::ONCE_INIT,
            ptr: 0 as *const PeerInfo,
        };
        unsafe {
            instance.get(PeerInfo::new)
        }
    }
}

impl ::protobuf::Clear for PeerInfo {
    fn clear(&mut self) {
        self.peer_id.clear();
        self.reputation = 0;
        self.is_blacklisted = false;
        self.is_unreachable = false;
        self.inactive_for.clear();
        self.last_seen.clear();
        self.modified.clear();
        self.created.clear();
        self.unknown_fields.clear();
    }
}

impl ::std::fmt::Debug for PeerInfo {
    fn fmt(&self, f: &mut ::std::fmt::Formatter<'_>) -> ::std::fmt::Result {
        ::protobuf::text_format::fmt(self, f)
    }
}

impl ::protobuf::reflect::ProtobufValue for PeerInfo {
    fn as_ref(&self) -> ::protobuf::reflect::ProtobufValueRef {
        ::protobuf::reflect::ProtobufValueRef::Message(self)
    }
}

static file_descriptor_proto_data: &'static [u8] = b"\
    \n\nPeer.proto\x12\x16Catalyst.Protocol.Peer\x1a\x1fgoogle/protobuf/time\
    stamp.proto\x1a\x1egoogle/protobuf/duration.proto\"K\n\x06PeerId\x12\x0e\
    \n\x02ip\x18\x01\x20\x01(\x0cR\x02ip\x12\x12\n\x04port\x18\x02\x20\x01(\
    \rR\x04port\x12\x1d\n\npublic_key\x18\x03\x20\x01(\x0cR\tpublicKey\"\x96\
    \x03\n\x08PeerInfo\x127\n\x07peer_id\x18\x01\x20\x01(\x0b2\x1e.Catalyst.\
    Protocol.Peer.PeerIdR\x06peerId\x12\x1e\n\nreputation\x18\x02\x20\x01(\
    \x11R\nreputation\x12%\n\x0eis_blacklisted\x18\x03\x20\x01(\x08R\risBlac\
    klisted\x12%\n\x0eis_unreachable\x18\x04\x20\x01(\x08R\risUnreachable\
    \x12<\n\x0cinactive_for\x18\x05\x20\x01(\x0b2\x19.google.protobuf.Durati\
    onR\x0binactiveFor\x127\n\tlast_seen\x18\x06\x20\x01(\x0b2\x1a.google.pr\
    otobuf.TimestampR\x08lastSeen\x126\n\x08modified\x18\x07\x20\x01(\x0b2\
    \x1a.google.protobuf.TimestampR\x08modified\x124\n\x07created\x18\x08\
    \x20\x01(\x0b2\x1a.google.protobuf.TimestampR\x07createdB\x02P\x01J\x85\
    \x11\n\x06\x12\x04\x13\0/\x01\n\xdf\x06\n\x01\x0c\x12\x03\x13\0\x122\xd4\
    \x06*\n\x20Copyright\x20(c)\x202019\x20Catalyst\x20Network\n\n\x20This\
    \x20file\x20is\x20part\x20of\x20Catalyst.Network.Protocol.Protobuffs\x20\
    <https://github.com/catalyst-network/protocol-protobuffs>\n\n\x20Catalys\
    t.Network.Protocol.Protobuffs\x20is\x20free\x20software:\x20you\x20can\
    \x20redistribute\x20it\x20and/or\x20modify\n\x20it\x20under\x20the\x20te\
    rms\x20of\x20the\x20GNU\x20General\x20Public\x20License\x20as\x20publish\
    ed\x20by\n\x20the\x20Free\x20Software\x20Foundation,\x20either\x20versio\
    n\x202\x20of\x20the\x20License,\x20or\n\x20(at\x20your\x20option)\x20any\
    \x20later\x20version.\n\x20\n\x20Catalyst.Network.Protocol.Protobuffs\
    \x20is\x20distributed\x20in\x20the\x20hope\x20that\x20it\x20will\x20be\
    \x20useful,\n\x20but\x20WITHOUT\x20ANY\x20WARRANTY;\x20without\x20even\
    \x20the\x20implied\x20warranty\x20of\n\x20MERCHANTABILITY\x20or\x20FITNE\
    SS\x20FOR\x20A\x20PARTICULAR\x20PURPOSE.\x20See\x20the\n\x20GNU\x20Gener\
    al\x20Public\x20License\x20for\x20more\x20details.\n\x20\n\x20You\x20sho\
    uld\x20have\x20received\x20a\x20copy\x20of\x20the\x20GNU\x20General\x20P\
    ublic\x20License\n\x20along\x20with\x20Catalyst.Network.Protocol.Protobu\
    ffs\x20If\x20not,\x20see\x20<https://www.gnu.org/licenses/>.\n\n\x08\n\
    \x01\x08\x12\x03\x15\0\"\n\t\n\x02\x08\n\x12\x03\x15\0\"\n\x08\n\x01\x02\
    \x12\x03\x17\0\x1f\n\t\n\x02\x03\0\x12\x03\x19\0)\n\t\n\x02\x03\x01\x12\
    \x03\x1a\0(\n\xaf\x01\n\x02\x04\0\x12\x04\x20\0$\x01\x1a\xa2\x01*\n\x20A\
    ggregated\x20size\x20of\x20the\x20fields\x20in\x20PeerId\x20should\x20be\
    \x2042\x20bytes\x20as\x20specified\x20in\n\x20https://github.com/catalys\
    t-network/protocol-blueprint/blob/master/PeerProtocol.md\n\n\n\n\x03\x04\
    \0\x01\x12\x03\x20\x08\x0e\n\x17\n\x04\x04\0\x02\0\x12\x03!\x04\x11\"\n\
    \x2016\x20bytes\n\n\x0c\n\x05\x04\0\x02\0\x05\x12\x03!\x04\t\n\x0c\n\x05\
    \x04\0\x02\0\x01\x12\x03!\n\x0c\n\x0c\n\x05\x04\0\x02\0\x03\x12\x03!\x0f\
    \x10\n\x16\n\x04\x04\0\x02\x01\x12\x03\"\x04\x14\"\t\x202\x20bytes\n\n\
    \x0c\n\x05\x04\0\x02\x01\x05\x12\x03\"\x04\n\n\x0c\n\x05\x04\0\x02\x01\
    \x01\x12\x03\"\x0b\x0f\n\x0c\n\x05\x04\0\x02\x01\x03\x12\x03\"\x12\x13\n\
    r\n\x04\x04\0\x02\x02\x12\x03#\x04\x19\"e\x20Peers\x20public\x20key,\x20\
    node\x20operators\x20are\x20encouraged\x20to\x20use\x20the\x20same,\x20p\
    ublic\x20key\x20across\x20all\x20their\x20nodes.\n\n\x0c\n\x05\x04\0\x02\
    \x02\x05\x12\x03#\x04\t\n\x0c\n\x05\x04\0\x02\x02\x01\x12\x03#\n\x14\n\
    \x0c\n\x05\x04\0\x02\x02\x03\x12\x03#\x17\x18\n\n\n\x02\x04\x01\x12\x04&\
    \0/\x01\n\n\n\x03\x04\x01\x01\x12\x03&\x08\x10\n#\n\x04\x04\x01\x02\0\
    \x12\x03'\x04\x17\"\x16\x20is\x20peerId\x20of\x20network\n\n\x0c\n\x05\
    \x04\x01\x02\0\x06\x12\x03'\x04\n\n\x0c\n\x05\x04\x01\x02\0\x01\x12\x03'\
    \x0b\x12\n\x0c\n\x05\x04\x01\x02\0\x03\x12\x03'\x15\x16\n!\n\x04\x04\x01\
    \x02\x01\x12\x03(\x04\x1a\"\x14\x20reputation\x20of\x20peer\n\n\x0c\n\
    \x05\x04\x01\x02\x01\x05\x12\x03(\x04\n\n\x0c\n\x05\x04\x01\x02\x01\x01\
    \x12\x03(\x0b\x15\n\x0c\n\x05\x04\x01\x02\x01\x03\x12\x03(\x18\x19\n5\n\
    \x04\x04\x01\x02\x02\x12\x03)\x04\x1c\"(\x20is\x20to\x20check\x20if\x20t\
    he\x20peer\x20is\x20blackListed\n\n\x0c\n\x05\x04\x01\x02\x02\x05\x12\
    \x03)\x04\x08\n\x0c\n\x05\x04\x01\x02\x02\x01\x12\x03)\t\x17\n\x0c\n\x05\
    \x04\x01\x02\x02\x03\x12\x03)\x1a\x1b\n@\n\x04\x04\x01\x02\x03\x12\x03*\
    \x04\x1c\"3\x20is\x20when\x20the\x20peer\x20cannot\x20be\x20reached\x20o\
    n\x20the\x20network\n\n\x0c\n\x05\x04\x01\x02\x03\x05\x12\x03*\x04\x08\n\
    \x0c\n\x05\x04\x01\x02\x03\x01\x12\x03*\t\x17\n\x0c\n\x05\x04\x01\x02\
    \x03\x03\x12\x03*\x1a\x1b\n:\n\x04\x04\x01\x02\x04\x12\x03+\x04.\"-\x20i\
    s\x20how\x20long\x20the\x20peer\x20has\x20beekn\x20inactive\x20for\n\n\
    \x0c\n\x05\x04\x01\x02\x04\x06\x12\x03+\x04\x1c\n\x0c\n\x05\x04\x01\x02\
    \x04\x01\x12\x03+\x1d)\n\x0c\n\x05\x04\x01\x02\x04\x03\x12\x03+,-\n-\n\
    \x04\x04\x01\x02\x05\x12\x03,\x04,\"\x20\x20is\x20when\x20the\x20peer\
    \x20was\x20last\x20seen\n\n\x0c\n\x05\x04\x01\x02\x05\x06\x12\x03,\x04\
    \x1d\n\x0c\n\x05\x04\x01\x02\x05\x01\x12\x03,\x1e'\n\x0c\n\x05\x04\x01\
    \x02\x05\x03\x12\x03,*+\n:\n\x04\x04\x01\x02\x06\x12\x03-\x04+\"-\x20mod\
    ified\x20is\x20when\x20the\x20peer\x20was\x20last\x20modified\n\n\x0c\n\
    \x05\x04\x01\x02\x06\x06\x12\x03-\x04\x1d\n\x0c\n\x05\x04\x01\x02\x06\
    \x01\x12\x03-\x1e&\n\x0c\n\x05\x04\x01\x02\x06\x03\x12\x03-)*\n3\n\x04\
    \x04\x01\x02\x07\x12\x03.\x04*\"&\x20created\x20is\x20when\x20the\x20pee\
    r\x20was\x20created\n\n\x0c\n\x05\x04\x01\x02\x07\x06\x12\x03.\x04\x1d\n\
    \x0c\n\x05\x04\x01\x02\x07\x01\x12\x03.\x1e%\n\x0c\n\x05\x04\x01\x02\x07\
    \x03\x12\x03.()b\x06proto3\
";

static mut file_descriptor_proto_lazy: ::protobuf::lazy::Lazy<::protobuf::descriptor::FileDescriptorProto> = ::protobuf::lazy::Lazy {
    lock: ::protobuf::lazy::ONCE_INIT,
    ptr: 0 as *const ::protobuf::descriptor::FileDescriptorProto,
};

fn parse_descriptor_proto() -> ::protobuf::descriptor::FileDescriptorProto {
    ::protobuf::parse_from_bytes(file_descriptor_proto_data).unwrap()
}

pub fn file_descriptor_proto() -> &'static ::protobuf::descriptor::FileDescriptorProto {
    unsafe {
        file_descriptor_proto_lazy.get(|| {
            parse_descriptor_proto()
        })
    }
}
