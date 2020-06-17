<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Wire.proto

namespace Catalyst\Protocol\Wire;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Protobuf type <code>Catalyst.Protocol.Wire.DeltaDfsHashBroadcast</code>
 */
class DeltaDfsHashBroadcast extends \Google\Protobuf\Internal\Message
{
    /**
     * <pre>
     * The DFS address at which the full content of the delta can be retrieved.
     * </pre>
     *
     * <code>bytes delta_dfs_hash = 1;</code>
     */
    private $delta_dfs_hash = '';
    /**
     * <pre>
     * The DFS address for the content of the delta preceding this candidate.
     * </pre>
     *
     * <code>bytes previous_delta_dfs_hash = 2;</code>
     */
    private $previous_delta_dfs_hash = '';

    public function __construct() {
        \GPBMetadata\Wire::initOnce();
        parent::__construct();
    }

    /**
     * <pre>
     * The DFS address at which the full content of the delta can be retrieved.
     * </pre>
     *
     * <code>bytes delta_dfs_hash = 1;</code>
     */
    public function getDeltaDfsHash()
    {
        return $this->delta_dfs_hash;
    }

    /**
     * <pre>
     * The DFS address at which the full content of the delta can be retrieved.
     * </pre>
     *
     * <code>bytes delta_dfs_hash = 1;</code>
     */
    public function setDeltaDfsHash($var)
    {
        GPBUtil::checkString($var, False);
        $this->delta_dfs_hash = $var;
    }

    /**
     * <pre>
     * The DFS address for the content of the delta preceding this candidate.
     * </pre>
     *
     * <code>bytes previous_delta_dfs_hash = 2;</code>
     */
    public function getPreviousDeltaDfsHash()
    {
        return $this->previous_delta_dfs_hash;
    }

    /**
     * <pre>
     * The DFS address for the content of the delta preceding this candidate.
     * </pre>
     *
     * <code>bytes previous_delta_dfs_hash = 2;</code>
     */
    public function setPreviousDeltaDfsHash($var)
    {
        GPBUtil::checkString($var, False);
        $this->previous_delta_dfs_hash = $var;
    }

}

