<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Rpc.proto

namespace Catalyst\Protocol\Rpc\Node;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Protobuf type <code>Catalyst.Protocol.Rpc.Node.ListWalletRequest</code>
 */
class ListWalletRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * <code>bool query = 1;</code>
     */
    private $query = false;

    public function __construct() {
        \GPBMetadata\Rpc::initOnce();
        parent::__construct();
    }

    /**
     * <code>bool query = 1;</code>
     */
    public function getQuery()
    {
        return $this->query;
    }

    /**
     * <code>bool query = 1;</code>
     */
    public function setQuery($var)
    {
        GPBUtil::checkBool($var);
        $this->query = $var;
    }

}
