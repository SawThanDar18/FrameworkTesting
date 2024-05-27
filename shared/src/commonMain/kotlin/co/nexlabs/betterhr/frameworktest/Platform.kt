package co.nexlabs.betterhr.frameworktest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform