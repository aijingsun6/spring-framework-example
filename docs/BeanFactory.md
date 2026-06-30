# BeanFactory

```mermaid
classDiagram
    BeanFactory <|-- ListableBeanFactory: extends
    BeanFactory <|-- AutowireCapableBeanFactory: extends
    BeanFactory <|-- HierarchicalBeanFactory: extends
    HierarchicalBeanFactory <|-- ConfigurableBeanFactory: extends
    SingletonBeanRegistry <|-- ConfigurableBeanFactory: extends
    ListableBeanFactory <|-- ConfigurableListableBeanFactory: extends
    AutowireCapableBeanFactory <|-- ConfigurableListableBeanFactory: extends
    ConfigurableBeanFactory <|-- ConfigurableListableBeanFactory: extends
    AliasRegistry <|-- BeanDefinitionRegistry: extends
    ConfigurableListableBeanFactory <|-- DefaultListableBeanFactory: implements
    BeanDefinitionRegistry <|-- DefaultListableBeanFactory: implements

```