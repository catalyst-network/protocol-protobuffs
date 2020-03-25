<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Rpc.proto

namespace Catalyst\Protocol\Rpc\Node;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>Catalyst.Protocol.Rpc.Node.AddFileToDfsResponse</code>
 */
class AddFileToDfsResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>bytes response_code = 1;</code>
     */
    protected $response_code = '';
    /**
     * Generated from protobuf field <code>string dfs_hash = 2;</code>
     */
    protected $dfs_hash = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $response_code
     *     @type string $dfs_hash
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Rpc::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>bytes response_code = 1;</code>
     * @return string
     */
    public function getResponseCode()
    {
        return $this->response_code;
    }

    /**
     * Generated from protobuf field <code>bytes response_code = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setResponseCode($var)
    {
        GPBUtil::checkString($var, False);
        $this->response_code = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string dfs_hash = 2;</code>
     * @return string
     */
    public function getDfsHash()
    {
        return $this->dfs_hash;
    }

    /**
     * Generated from protobuf field <code>string dfs_hash = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setDfsHash($var)
    {
        GPBUtil::checkString($var, True);
        $this->dfs_hash = $var;

        return $this;
    }

}

