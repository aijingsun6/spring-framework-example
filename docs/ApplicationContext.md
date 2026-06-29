# ApplicationContext


## 继承关系
```mermaid

classDiagram
    EnvironmentCapable <|-- ApplicationContext : extends
    ListableBeanFactory <|-- ApplicationContext : extends
    HierarchicalBeanFactory <|-- ApplicationContext : extends
    MessageSource <|-- ApplicationContext : extends
    ApplicationEventPublisher <|-- ApplicationContext : extends
    ResourcePatternResolver <|-- ApplicationContext : extends
    BeanFactory <|-- ListableBeanFactory : extends
    BeanFactory <|-- HierarchicalBeanFactory : extends
    ResourceLoader <|-- ResourcePatternResolver: extends
```
## 详细内容
### EnvironmentCapable
```mermaid
classDiagram
    class EnvironmentCapable {
        +Environment getEnvironment()
    }
```
### ListableBeanFactory
```mermaid
classDiagram
 class ListableBeanFactory {
        +boolean containsBeanDefinition(String beanName)
        +int getBeanDefinitionCount()
        +String[] getBeanDefinitionNames()
    }
```
### ResourcePatternResolver
```mermaid
classDiagram
    class ResourcePatternResolver {
        +Resource[] getResources(String locationPattern)
    }
```
### ResourceLoader
```mermaid
classDiagram
    class ResourceLoader {
        +Resource getResource(String location)
        +ClassLoader getClassLoader()
    }
```
### ApplicationEventPublisher
```mermaid
classDiagram
    class ApplicationEventPublisher {
        +void publishEvent(ApplicationEvent event)
        +void publishEvent(Object event)
    }
```
### MessageSource
```mermaid
classDiagram
    class MessageSource {
        +String getMessage(String code, Object[] args, String defaultMessage, Locale locale)
        +String getMessage(String code, Object[] args, Locale locale)
        +String getMessage(MessageSourceResolvable resolvable, Locale locale)
    }
```
### HierarchicalBeanFactory
```mermaid
classDiagram
    class HierarchicalBeanFactory {
        +BeanFactory getParentBeanFactory()
        +boolean containsLocalBean(String name)
    }
```