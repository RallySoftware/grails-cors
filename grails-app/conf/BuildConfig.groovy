grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.resolution = {

    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }

    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'

    repositories {
        inherits true

        grailsCentral()

        mavenRepo 'http://alm-build:8080/nexus/content/groups/public'
        mavenRepo 'http://alm-build:8080/nexus/content/groups/public-snapshots'
    }

    dependencies {
        test 'org.hamcrest:hamcrest-all:1.3'
    }

    plugins {
        build(":release:2.2.1") {
            export = false
        }
        compile 'com.rallydev.plugins.grails:grails-rally-plugin-publisher-plugin:2.0-SNAPSHOT'
    }
}

coverage {
    enabledByDefault = false
    xml = true
}
