resolvers in ThisBuild += "lightbend-commercial-mvn" at
        "https://repo.lightbend.com/pass/KzSt7qnbT_PkD_tc97wPx_OKu4xWHLK9F8ICkKhLcTjmjHem/commercial-releases"
resolvers in ThisBuild += Resolver.url("lightbend-commercial-ivy",
        url("https://repo.lightbend.com/pass/KzSt7qnbT_PkD_tc97wPx_OKu4xWHLK9F8ICkKhLcTjmjHem/commercial-releases"))(Resolver.ivyStylePatterns)
