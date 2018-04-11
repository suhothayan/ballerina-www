package org.ballerinalang.platform.playground.controller.util;

public class Constants {
    public static final String BPG_APP_TYPE_LAUNCHER = "bpg-launcher";
    public static final String LAUNCHER_URL_PREFIX = "launcher";

    // Controller roles
    public static final String CONTROLLER_ROLE_API_SERVER = "API_SERVER";
    public static final String CONTROLLER_ROLE_MIN_CHECK = "MIN_CHECK";
    public static final String CONTROLLER_ROLE_IDLE_CHECK = "IDLE_CHECK";

    // Environment variable keys
    public static final String ENV_CONTROLLER_ROLE = "BPG_CONTROLLER_ROLE";
    public static final String ENV_BPG_NAMESPACE = "BPG_NAMESPACE";
    public static final String ENV_LAUNCHER_IMAGE_NAME = "BPG_LAUNCHER_IMAGE_NAME";
    public static final String ENV_STEP_UP = "BPG_SCALING_STEP_UP";
    public static final String ENV_STEP_DOWN = "BPG_SCALING_STEP_DOWN";
    public static final String ENV_DESIRED_COUNT = "BPG_SCALING_DESIRED";
    public static final String ENV_MAX_COUNT = "BPG_SCALING_MAX";
    public static final String ENV_FREE_BUFFER = "BPG_SCALING_FREE_BUFFER";
    public static final String ENV_IDLE_TIMEOUT = "BPG_SCALING_IDLE_TIMEOUT_MIN";

    // Member status values
    public static final String MEMBER_STATUS_FREE = "FREE";
    public static final String MEMBER_STATUS_BUSY = "BUSY";
    public static final String DOMAIN_PLAYGROUND_BALLERINA_IO = "playground.ballerina.io";
}