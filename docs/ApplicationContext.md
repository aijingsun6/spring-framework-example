# ApplicationContext

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
    
    class EnvironmentCapable {
        +Environment getEnvironment()
    }
    
    class ListableBeanFactory {
        +boolean containsBeanDefinition(String beanName)
        +int getBeanDefinitionCount()
        +String[] getBeanDefinitionNames()
        +<T> ObjectProvider<T> getBeanProvider(Class<T> requiredType, boolean allowEagerInit)
        +<T> ObjectProvider<T> getBeanProvider(ResolvableType requiredType, boolean allowEagerInit)
        +String[] getBeanNamesForType(ResolvableType type)
        +String[] getBeanNamesForType(ResolvableType type, boolean includeNonSingletons, boolean allowEagerInit)
        +String[] getBeanNamesForType(Class<?> type)
        +String[] getBeanNamesForType(@Nullable Class<?> type, boolean includeNonSingletons, boolean allowEagerInit)
        +<T> Map<String, T> getBeansOfType(@Nullable Class<T> type)
        +<T> Map<String, T> getBeansOfType(@Nullable Class<T> type, boolean includeNonSingletons, boolean allowEagerInit)
        +String[] getBeanNamesForAnnotation(Class<? extends Annotation> annotationType)
        +Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> annotationType)
        +<A extends Annotation> A findAnnotationOnBean(String beanName, Class<A> annotationType)
        +<A extends Annotation> A findAnnotationOnBean(String beanName, Class<A> annotationType, boolean allowFactoryBeanInit)
        +<A extends Annotation> Set<A> findAllAnnotationsOnBean(String beanName, Class<A> annotationType, boolean allowFactoryBeanInit)
    }
    
    class ResourcePatternResolver {
        +Resource[] getResources(String locationPattern)
    }
    
    class ResourceLoader {
        +Resource getResource(String location)
        +ClassLoader getClassLoader()
    }
    
   
    class ApplicationEventPublisher {
        +void publishEvent(ApplicationEvent event)
        +void publishEvent(Object event)
    }
    class MessageSource {
        +String getMessage(String code, Object[] args, String defaultMessage, Locale locale)
        +String getMessage(String code, Object[] args, Locale locale)
        +String getMessage(MessageSourceResolvable resolvable, Locale locale)
    }
    class HierarchicalBeanFactory {
        +BeanFactory getParentBeanFactory()
        +boolean containsLocalBean(String name)
    }
```