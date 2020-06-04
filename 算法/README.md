## 算法的时间复杂度
假设每行代码的执行时间为t，那么

```Java
  int sunFunc(int n){   
    int num = 0;  //执行一次
    for (int i = 0; i<n; i++){  //执行n次
      num = num + i;  //执行n次
    }
    return num; //执行一次
  }
```

    这块代码执行的时间就是(2n+2)*t
