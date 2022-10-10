# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 구현 목록 정리
* 자동차가 전진조건에 충족하면 전진하도록 한다.
* 자동차에 이름을 부여한다.
* 자동차의 이름이 5자를 초과하면 에러를 발생한다. IllegalArgumentException
* 초기 위치 생성시 위치의 값은 0이다.
* 위치를 증가시킬때 마다 증가한다.
* 0~9 사이에 랜덤값을 구한후 구한 값이 4 이상일 경우 전진 하는 조건을 생성한다.
* 자동차 끼리 비교하여 우승자의 위치 값을 찾는다.
* 우승자의 위치값과 동일한 자동차를 가져온다.
* 경주마다 자동차 이름과 전진한 위치를 출력해 준다.
* 경주 완료 후 우승자의 위치값을 조회한다.
* 우승자의 위치값과 동일한 자동차를 모두 출력한다.
* 자동차의 이름을 입력받는다.
* 자동차의 경주 결과와 우승자를 출력해 준다.