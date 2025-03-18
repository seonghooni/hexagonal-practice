pluginManagement { repositories { gradlePluginPortal() } }

rootProject.name = "example"
include(":monolithic")

include(":core")

include(":common")

include(":board")
project(":board").projectDir = file("services/board")

// module - board/api
include(":board:api")
project(":board:api").projectDir = file("services/board/api")

include(":board:api:domain")
project(":board:api:domain").projectDir = file("services/board/api/domain")

include(":board:api:readmodel")
project(":board:api:readmodel").projectDir = file("services/board/api/readmodel")

include(":board:api:exception")
project(":board:api:exception").projectDir = file("services/board/api/exception")


// module - board/application

include(":board:application")
project(":board:application").projectDir = file("services/board/application")

// module - board/driven
include(":board:driven")
project(":board:driven").projectDir = file("services/board/driven")

include(":board:driven:entity")
project(":board:driven:entity").projectDir = file("services/board/driven/entity")

include(":board:driven:RDB")
project(":board:driven:RDB").projectDir = file("services/board/driven/RDB")

// module - board/driving
include(":board:driving")
project(":board:driving").projectDir = file("services/board/driving")

include(":board:driving:web")
project(":board:driving:web").projectDir = file("services/board/driving/web")
