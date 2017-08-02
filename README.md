### Test project to reproduce [WW-4827](https://issues.apache.org/jira/browse/WW-4827).

#### Running

```
mvn jetty:run
```

#### Local copy of `ContainerImpl`

This project has local copy of `com.opensymphony.xwork2.inject.ContainerImpl` which is slightly modified in order to reproduce WW-4827 in various environments.
See `containerAsLastMethod` method in it.
