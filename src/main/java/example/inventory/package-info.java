// this is optional, tests would still pass without this.
// However, we add this type of information to document and add extra safeguards to which module can import which modules
@org.springframework.modulith.ApplicationModule(
        allowedDependencies = {"order", "order::spi"}
)
package example.inventory;
