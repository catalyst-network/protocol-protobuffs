<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Rpc.proto

namespace Catalyst\Protocol\Rpc\Node;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Protobuf type <code>Catalyst.Protocol.Rpc.Node.VerifyMessageResponse</code>
 */
class VerifyMessageResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * <code>bool is_signed_by_key = 1;</code>
     */
    private $is_signed_by_key = false;

    public function __construct() {
        \GPBMetadata\Rpc::initOnce();
        parent::__construct();
    }

    /**
     * <code>bool is_signed_by_key = 1;</code>
     */
    public function getIsSignedByKey()
    {
        return $this->is_signed_by_key;
    }

    /**
     * <code>bool is_signed_by_key = 1;</code>
     */
    public function setIsSignedByKey($var)
    {
        GPBUtil::checkBool($var);
        $this->is_signed_by_key = $var;
    }

}

