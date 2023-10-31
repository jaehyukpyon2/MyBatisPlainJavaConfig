# Java, MyBatis를 활용한 콘솔 CRUD
이것이 자바다(개정판) 마지막 챕터 CRUD를 MyBatis와 MariaDB를 사용해서 CRUD 콘솔 프로그램을 작성

## 목표
스프링 프레임워크의 자동 설정을 사용하지 않고 직접 MyBatis xml config 파일과 SqlSessionFactoryBuilder를 사용해서 SqlSessionFactory를 build한 후 사용한다

## 사용 기술

<img src="https://img.shields.io/badge/Java-FF0000?style=for-the-badge&logo=OpenJDK&logoColor=white"/> <img src="https://img.shields.io/badge/mybatis-AA344D?style=for-the-badge&logo=apache&logoColor=white"> <img src="https://img.shields.io/badge/mariaDB-003545?style=for-the-badge&logo=mariaDB&logoColor=white">


## 배운점

1. 스프링 부트의 AutoConfiguration을 활용하지 않고 [mybatis-config.xml](https://github.com/jaehyukpyon2/MyBatisPlainJavaConfig/blob/main/src/config/mybatis-config.xml) 파일에서 직접 Data Source를 설정하는 방법
2. MyBatis에서 DDL을 직접 실행하는 것을 권하지 않음 (truncate문 실행 불가)

## Demo

> * create<br>
> ![create](https://github.com/jaehyukpyon2/MyBatisPlainJavaConfig/assets/145942491/779aa1b6-01f5-4662-9140-5c4dbc7a190e)

> * read<br>
> ![read](https://github.com/jaehyukpyon2/MyBatisPlainJavaConfig/assets/145942491/e7ce744d-8a03-4ef2-86e3-332eca523ec2)

> * update
> ![update](https://github.com/jaehyukpyon2/MyBatisPlainJavaConfig/assets/145942491/873d1c60-4005-4517-9a5f-55ea29e19c95)

> * delete
> ![delete](https://github.com/jaehyukpyon2/MyBatisPlainJavaConfig/assets/145942491/9f2f97d7-e622-4ce3-9fd7-911826978069)