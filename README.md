# DifferentPackageNameApk
一键打包出多个不同包名

```
productFlavors {
        app1 {
            manifestPlaceholders = [str: "releaseStr", package_name: "com.jd.cloud1"]
            applicationId "com.jd.cloud1"
        }
 
        app2 {
            manifestPlaceholders = [str: "devStr", package_name: "com.jd.cloud2"]
            applicationId "com.jd.cloud2"
        }
        app3 {
            manifestPlaceholders = [str: "devStr", package_name: "com.jd.cloud3"]
            applicationId "com.jd.cloud3"
        }
        app4 {
            manifestPlaceholders = [str: "devStr", package_name: "com.jd.cloud4"]
            applicationId "com.jd.cloud4"
        }
        app5 {
            manifestPlaceholders = [str: "devStr", package_name: "com.jd.cloud5"]
            applicationId "com.jd.cloud5"
        }
```
