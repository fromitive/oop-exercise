## 핸드폰 요금 형식

| 유형          | 형식                      | 예                            |
| ------------- | ------------------------- | ----------------------------- |
| 고정요금 방식 | A초당 B원                 | 10초당 18원                   |
| 시간대별 방식 | A시부터 B시끼자 C초당 D원 | 00시부터 19시까지 10초당 18월 |
| 요일별 방식   | 평일에는 A초당 B원        | 평일에는 10초당 38월          |
| 구간별 방식   | 초기 A분 동안 B초당 C원   | 초기 1분 동안(중간,이후) 10초당 50원 |

## 시간 관련 객체

위치: `import java.time.[]`

### Duration

기간을 저장한다.

####  사용법

Duration.beetween : LocalDateTime 의 기간 구할 때 사용
getSeconds() : 초를 계산할 때 사용
 
### LocalDateTime

날짜와 시간을 저장한다.

#### 사용법

LocalDateTime.of(int year, int month, int dayOfMonth, int hour, int minute, int second)