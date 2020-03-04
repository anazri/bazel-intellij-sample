workspace(name = "bazel_inteillj_sample")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

RULES_JVM_EXTERNAL_TAG = "3.0"
RULES_JVM_EXTERNAL_SHA = "62133c125bf4109dfd9d2af64830208356ce4ef8b165a6ef15bbff7460b35c3a"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "org.springframework.boot:spring-boot-autoconfigure:2.2.5.RELEASE",
        "org.springframework.boot:spring-boot-starter-web:2.2.5.RELEASE",
        "org.springframework.boot:spring-boot-starter-test:2.2.5.RELEASE",
        "org.springframework.boot:spring-boot-test:2.2.5.RELEASE",
        "org.springframework.boot:spring-boot:2.2.5.RELEASE",
        "org.springframework:spring-context:5.2.4.RELEASE",
        "org.springframework:spring-test:5.2.4.RELEASE",
        "org.springframework:spring-web:5.2.4.RELEASE",
        "io.springfox:springfox-spring-web:2.9.2",
        "io.springfox:springfox-swagger-ui:2.9.2",
        "io.springfox:springfox-swagger2:2.9.2",
        "io.springfox:springfox-core:2.9.2",
        "io.swagger:swagger-annotations:1.6.0",
        "io.springfox:springfox-spi:2.9.2",
        "org.projectlombok:lombok:1.18.12",
        "junit:junit:4.12",
    ],
    repositories = [
        "http://maven.aliyun.com/nexus/content/groups/public/",
        "https://repo1.maven.org/maven2",
        "https://jcenter.bintray.com/",
        "https://maven.google.com",
    ],
)