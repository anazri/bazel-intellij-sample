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
        "org.springframework.boot:spring-boot-starter-web:5.2.3.RELEASE",
        "org.springframework.boot:spring-boot-starter-test:5.2.3.RELEASE",
        "io.springfox:springfox-swagger-ui:2.7",
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