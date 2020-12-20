# 백엔드 API 사용 실습
========================

## 1주차 [20.12.15 ~ 20.12.19]

1. Github 계정생성 (완료)
    + 기존 계정 이용

2. JDK/Tomcat/mybatis Eclipse설치   
    + 2.1. JDK : 8u_221 버전 (https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html)  
        기존 1.8.0_111 사용  
    + 2.2. 이클립스 세팅 (루나)  
        설치 완료 후 Eclipse.ini(eclipse 설치 경로에 존재)의 하단에  
'''
(-vm  
C:\Program Files\Java\jdk1.8.0_221\bin\javaw.exe 추가)  
'''

    + 2.3. 스프링 설치 3.2.4  
    + 2.4 톰캣 8 연동  
    + 2.5  메이븐 설치(3.6.3) 및 이클립스 연동  
 > pom.xml에서 스프링 5.2.12.RELEASE /메이븐 3.7.0/ jdk 1.8설정  


3. mybatis 설치
 > mariadb-10.3.27/ MySQL Workbench 8.0.22
 > 스키마, 테이블 생성 및 데이터 입력
 
4.스프링, Mariadb, MyBatis 연동, 데이터 조회
 > 연동 완료 및 데이터 조회 완료
 
5. 스프링 환경 구축 VS 스프링부트 환경 구축 비교해보기



참고)   
- 기존 진행중인 프로젝트에 영향이 있을까봐 최대한 사용하던 버전을 이용함 
- 메이븐은 처음 사용으로 좀 더 알아보기 
- Maven Repository 다른 로컬폴더로 변경하고 싶었지만 제대로 되지 않아 /.m2/repository 
- 깃허브 브랜치 해결하기..

굼금한 점)   
- 왜    @Inject 에는 public이아닌   private 인지? 
- 톰캣 8 버전으로 실행은 되는데 앞으로 과제에서도 괜찮을지?




