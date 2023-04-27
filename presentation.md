<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

# Spring Modulith - Spring for the Architecturally Curious Developer

[https://spring.io/projects/spring-modulith](https://spring.io/projects/spring-modulith)

Demo: [https://github.com/sw-tracker/spring-modulith-demo](https://github.com/sw-tracker/spring-modulith-demo)

![](presentation/original-author.png)

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

`Spring Modulith` is a new package by `VMware` that aims to help/guide you to build domain structured applications.

![](presentation/spring-modulith.png)

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

## Problem Statement

Typical `Spring Boot` applications follow a technical structure.

> Technical arrangement, functional decomposition approach: layering, or ports and adapters, etc.

![](presentation/functional-tructure.png)

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

**This is a problem!**

![](presentation/technical-org-diagram.png)

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

It would be nice if the framework provided support for domain based structuring.

![](presentation/domain-structure.png)

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

![](presentation/functional-vs-domain-structure.png)

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

# Demo

- Repo overview
- Architectural Observability
- Verifying Application Module Structure
- Integration Testing Application Modules

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

# Architectural Observability

Being able to get a high-level understanding of the logical, functional parts of an application and how they interact with each other.

![](presentation/generated-puml.png)

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

# Verifying Application Module Structure

- ArchUnit style tests (under the hood), with more extensive defaults
- Tests:<br/>
    `ApplicationModules.of(Application.class).verify();`
  - No cycles on the application module level
  - Efferent module access via API packages only: Only public classes/etc. in the top level folder can be used by other domains
  - Explicitly allowed application module dependencies only (optional - via `package-info.java`) <br/>
    `@ApplicationModule(allowedDependencies = …)`

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

# Integration Testing Application Modules

`Spring Modulith` allows to run integration tests bootstrapping individual application modules in isolation or combination with others.

These are slice tests, similarly to `@DataJpaTest` or `@WebMvcTest`.
Except these are vertical slices rather than horizontal slices.

```java
package example.order;

@ApplicationModuleTest
class OrderIntegrationTests {

  // Individual test cases go here
}
```

```shell
15:44:46.477 - main : Re-configuring auto-configuration and entity scan packages to: example.order.
```

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

# Q & A

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
