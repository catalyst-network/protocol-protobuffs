<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Wire.proto

namespace Catalyst\Protocol\Wire;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 **
 * A wrapper around the service message, the contents of service message should be signed by the sender to avoid tampering mid-transit.
 *
 * Generated from protobuf message <code>Catalyst.Protocol.Wire.ProtocolMessage</code>
 */
class ProtocolMessage extends \Google\Protobuf\Internal\Message
{
    /**
     * is the sender's peerId
     *
     * Generated from protobuf field <code>.Catalyst.Protocol.Peer.PeerId peer_id = 1;</code>
     */
    protected $peer_id = null;
    /**
     * is a 16 bytes guid used to match responses to their original requests
     *
     * Generated from protobuf field <code>bytes correlation_id = 2;</code>
     */
    protected $correlation_id = '';
    /**
     * is the shortened protocol name of the message type being encoded in the value field (cf Any from protobuf WellKnownTypes)
     *
     * Generated from protobuf field <code>string type_url = 3;</code>
     */
    protected $type_url = '';
    /**
     * is the actual value of the message being wrapped (cf Any from protobuf WellKnownTypes)
     *
     * Generated from protobuf field <code>bytes value = 4;</code>
     */
    protected $value = '';
    /**
     * is the ed25519ph context signature
     *
     * Generated from protobuf field <code>.Catalyst.Protocol.Cryptography.Signature signature = 5;</code>
     */
    protected $signature = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Catalyst\Protocol\Peer\PeerId $peer_id
     *           is the sender's peerId
     *     @type string $correlation_id
     *           is a 16 bytes guid used to match responses to their original requests
     *     @type string $type_url
     *           is the shortened protocol name of the message type being encoded in the value field (cf Any from protobuf WellKnownTypes)
     *     @type string $value
     *           is the actual value of the message being wrapped (cf Any from protobuf WellKnownTypes)
     *     @type \Catalyst\Protocol\Cryptography\Signature $signature
     *           is the ed25519ph context signature
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Wire::initOnce();
        parent::__construct($data);
    }

    /**
     * is the sender's peerId
     *
     * Generated from protobuf field <code>.Catalyst.Protocol.Peer.PeerId peer_id = 1;</code>
     * @return \Catalyst\Protocol\Peer\PeerId
     */
    public function getPeerId()
    {
        return $this->peer_id;
    }

    /**
     * is the sender's peerId
     *
     * Generated from protobuf field <code>.Catalyst.Protocol.Peer.PeerId peer_id = 1;</code>
     * @param \Catalyst\Protocol\Peer\PeerId $var
     * @return $this
     */
    public function setPeerId($var)
    {
        GPBUtil::checkMessage($var, \Catalyst\Protocol\Peer\PeerId::class);
        $this->peer_id = $var;

        return $this;
    }

    /**
     * is a 16 bytes guid used to match responses to their original requests
     *
     * Generated from protobuf field <code>bytes correlation_id = 2;</code>
     * @return string
     */
    public function getCorrelationId()
    {
        return $this->correlation_id;
    }

    /**
     * is a 16 bytes guid used to match responses to their original requests
     *
     * Generated from protobuf field <code>bytes correlation_id = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setCorrelationId($var)
    {
        GPBUtil::checkString($var, False);
        $this->correlation_id = $var;

        return $this;
    }

    /**
     * is the shortened protocol name of the message type being encoded in the value field (cf Any from protobuf WellKnownTypes)
     *
     * Generated from protobuf field <code>string type_url = 3;</code>
     * @return string
     */
    public function getTypeUrl()
    {
        return $this->type_url;
    }

    /**
     * is the shortened protocol name of the message type being encoded in the value field (cf Any from protobuf WellKnownTypes)
     *
     * Generated from protobuf field <code>string type_url = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setTypeUrl($var)
    {
        GPBUtil::checkString($var, True);
        $this->type_url = $var;

        return $this;
    }

    /**
     * is the actual value of the message being wrapped (cf Any from protobuf WellKnownTypes)
     *
     * Generated from protobuf field <code>bytes value = 4;</code>
     * @return string
     */
    public function getValue()
    {
        return $this->value;
    }

    /**
     * is the actual value of the message being wrapped (cf Any from protobuf WellKnownTypes)
     *
     * Generated from protobuf field <code>bytes value = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setValue($var)
    {
        GPBUtil::checkString($var, False);
        $this->value = $var;

        return $this;
    }

    /**
     * is the ed25519ph context signature
     *
     * Generated from protobuf field <code>.Catalyst.Protocol.Cryptography.Signature signature = 5;</code>
     * @return \Catalyst\Protocol\Cryptography\Signature
     */
    public function getSignature()
    {
        return $this->signature;
    }

    /**
     * is the ed25519ph context signature
     *
     * Generated from protobuf field <code>.Catalyst.Protocol.Cryptography.Signature signature = 5;</code>
     * @param \Catalyst\Protocol\Cryptography\Signature $var
     * @return $this
     */
    public function setSignature($var)
    {
        GPBUtil::checkMessage($var, \Catalyst\Protocol\Cryptography\Signature::class);
        $this->signature = $var;

        return $this;
    }

}

