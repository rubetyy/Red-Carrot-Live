![logo](./docs/image/logo.png)
<br>

# π§‘ νλΉλ¬΄ λΌμ΄λΈ π§‘

λκ΅¬λ νλ§€ν  μ μκ³  λκ΅¬λ κ΅¬λ§€ν  μ μλ μ€κ³  μνκ³Ό μμκ³΅μΈμ μν λΌμ΄λΈ μ»€λ¨Έμ€ νλ‘μ νΈμλλ€. 
π€π[νλΉλ¬΄λΌμ΄λΈ](https://i5c103.p.ssafy.io/)

<br>

### νλΉλ¬΄ λΌμ΄λΈλ₯Ό κ°λ°ν μμΈκ΄μ£Όλ‘±λνμ μκ°ν©λλ€ !

- κΉμ©μ¬ π€
  - Vueμ λ¬μΈμ΄ λκ³ μΆμ λ

- κΉμ°½κ·π
  - μ½λ© νμ§λ§... / κ·Έκ² λ­λ°? / μ½λ© νμ§λ§λΌκ³ ... / μκ² μ΄

- μ΄μ°μ§ π
  - μ¬μ©μ λ§μ‘±κ°μ μ΅μμΌλ‘νλ μμ±λ μλ μλΉμ€ κ΅¬νμ λͺ©νλ‘ ν©λλ€ !
  
- μ΅μ±μ π€©
  - λ§κ°κΈ°νμ μ μ§ν€λ μ¬λμ΄ λκ² μ΅λλ€
  

<br>

![μλΉμ€μκ°μ΄λ―Έμ§](./docs/image/νλΉλ¬΄μκ°.jpg)

<br>

---

## π μλΉμ€ μν€νμ²

![μλΉμ€μν€νμ³](./docs/image/architecture.png)

<br>

## :video_game: κΈ°μ  μ€ν

### π»Back-End

  <details>
      <summary>Back μμΈν μ΄ν΄λ³΄κΈ° π₯</summary>
      <ul>
        <li>κΈ°μ μ€ν β</li>
      </ul>
      <ul>
          <li>Spring-Boot : 2.3.9</li>
          <li>Spring Security</li>
          <li>spring-boot-starter-web</li>
          <li>spring-boot-starter-websocket</li>
          <li>spring-boot-starter-freemarker</li>
          <li>spring-boot-starter-data-jpa</li>
          <li>spring-boot-starter-jdbc</li>
          <li>spring-boot-starter-actuator</li>
          <li>modelmapper : 2.3.8</li>
          <li>jjwt : 0.9.1</li>
          <li>lombok</li>
          <li>mysql : 8.0.24</li>
      </ul>
  </details>

### β¨Front-End

<details>
    <summary>Front μμΈν μ΄ν΄λ³΄κΈ° π</summary>
    <ul>
        <li>κΈ°μ μ€ν β</li>
    </ul>   
    <ul>
        <li>JS, HTML, CSS</li>
        <li>Vue.js @2.6.14</li>
    </ul>
    <li>--------------------------------------------------------------------------------------</li>
     <ul>
        <li>λΌμ΄λΈλ¬λ¦¬ π</li>
    </ul>   
    <ul>
        <li>axios @0.21.1 : Promise κΈ°λ° HTTP ν΄λΌμ΄μΈνΈ</li>
        <li>bootstrap @5.0.2 : μ μ²΄μ μΈ λμμΈ</li>
        <li>bootstrap-vue @2.21.2</li>
        <li>core-js @3.6.5</li>
        <li>openvidu-browser @2.19.0 : μ€μκ° λΌμ΄λΈ λ°©μ‘</li>
        <li>sockjs-client @1.5.1 : μ€μκ° μ±ν</li>
        <li>sweetalert @2.1.2 : alert μ»€μ€ν</li>
        <li>swiper @6.8.1 : μΊλ‘μ°μ κ΅¬ν</li>
        <li>webstomp-client @1.2.6 : 1λ1 μ±ν</li>
    </ul>
</details>

### πInfra

  <details>
      <summary>κ°λ°, μμΈν μ΄ν΄λ³΄κΈ° π₯</summary>
      <ul>
          <li>AWS EC2 - Deploy Server</li>
          <li>GitLab</li>
          <li>Docker</li>
      </ul>
  </details>
<br>

-------------------------------------------------


## βοΈ Install and Usage

#### μμ€ν νκ²½

<details>
<summary>νλΉλ¬΄λΌμ΄λΈλ μλμ κ°μ νκ²½μμ μ€ν μ€μλλ€.</summary>
      <ul>
          <li>OS : Linux version 5.8.0-1041-aws (buildd@lgw01-amd64-035) (gcc (Ubuntu 9.3.0-17ubuntu1~20.04) 9.3.0, GNU ld (GNU Binutils for Ubuntu) 2.34) #43~20.04.1-Ubuntu SMP Thu Jul 15 11:07:29 UTC 2021</li>
          <li>Cpu λͺ¨λΈ : Intel(R) Xeon(R) CPU E5-2686 v4 @ 2.30GHz</li>
          <li>Total Memory: 16395128 kB</li>
          <li>λ¬Όλ¦¬ cpu κ°μ : 4,	cpuλΉ λ¬Όλ¦¬ μ½μ΄ : 4,	λΌλ¦¬ μ½μ΄ μ : 32</li>
      </ul>
</details>


#### μμ€ν κ΅¬μ±

<details>
<summary>μμΈλ³΄κΈ°</summary>
      <ul>
          <li>DB μλ² : mysql  Ver 8.0.26-0ubuntu0.20.04.2 for Linux on x86_64 ((Ubuntu))</li>
          <li>νμΌ μλ² : νλ‘μ νΈ backend/images ν΄λ</li>
          <li>WebRTC : openvidu-server:2.19.0</li>
      </ul>
</details>


#### HTTPS ν€ λ°κΈ
<details>
frontendμμλ sslμ΄ μ μ©λμ΄ μκΈ° λλ¬Έμ HTTPS μΈμ¦μ λ°μμΌν©λλ€.

```bash
sudo apt-get install letsencrypt
# λ§μ½ nginxλ₯Ό μ¬μ©μ€μ΄λ©΄ μ€μ§
sudo systemctl stop nginx
# μΈμ¦μ λ°κΈ
sudo letsencrypt certonly --standalone -d wwwμ μΈν λλ©μΈ μ΄λ¦
# μ΄λ©μΌ μ°κ³  Agree
# λ΄μ€λ ν° no
# ν€κ° λ°κΈλλλ° μ΄ λ κ°μ§λ₯Ό μ¨μΌν©λλ€. λ°μ κ²½λ‘μ κ°κ° νλμ© μμ΅λλ€.
 ssl_certificate /etc/letsencrypt/live/λλ©μΈμ΄λ¦/fullchain.pem; 
 ssl_certificate_key /etc/letsencrypt/live/λλ©μΈμ΄λ¦/privkey.pem; 
```
</details>

<br>

---


##   :open_file_folder: κ°λ° μ€νλ¦°νΈ

|μ€νλ¦°νΈβ | κΈ°κ°π | FEπ   | BEπ€   |
| :----: | :------: | -------- | ---- |
| νλ‘μ νΈ κ΅¬μ λ° μ°©μ **(v0.0.1)** | 2021.07.05<br /> ~ <br />2021.07.09 | - νλ‘μ νΈ μμ΄λμ΄ λμΆ<br />- μμ΄μ΄ νλ μ μμ±<br />- κ°λ°νκ²½ κ΅¬μΆ<br/>- μ»΄ν¬λνΈ κ΅¬μ‘° νμ±<br/> | - Database ERD μμ μ§ν<br />- REST API λ¬Έμ μμ±<br />- κ°λ°νκ²½ κ΅¬μΆ<br /> |
| νλ‘μ νΈ κΈ°λ³Έ κΈ°λ₯ κ°λ°<br /> **(v1.0.0)** |  2021.07.12<br />~<br />2021.07.16  | **κΉμ©μ¬**<br/>- μ¬μ©μλ λ¬Όκ±΄μ νλ§€νκΈ° μν΄ μν μ λ³΄λ₯Ό λ±λ‘ν  μ μμ΅λλ€ [#S05P12C103-68](https://meeting.ssafy.com/s05p11c101/channels/13#)<br/>- νμΌ μλ‘λ/λ€μ΄λ‘λ λ°±μλ κΈ°λ₯ κ°λ° [#S05P12C103-73](https://meeting.ssafy.com/s05p11c101/channels/13#)<br/>- μνκ΄λ¦¬ μ»¨νΈλ‘€λ¬ κ΅¬ν [#S05P12C103-69](https://meeting.ssafy.com/s05p11c101/channels/13#)<br/>- μ ν λ±λ‘νμ΄μ§ κΈ°λ³Έ μμ μμ± [#S05P12C103-21](https://jira.ssafy.com/browse/S05P12C103-21)<br/><br/><br/> **κΉμ°½κ·**<br/>- μ ν λ±λ‘νμ΄μ§ λ±λ‘ κ΅¬ν [#S05P12C103-78](https://jira.ssafy.com/browse/S05P12C103-78)<br/>- μ ν λ±λ‘νμ΄μ§ ν ν° κ° λ³΄λ΄ μμ²­ [#S05P12C103-82](https://jira.ssafy.com/browse/S05P12C103-82)<br/>- λ§μ΄νμ΄μ§ responseκ΅¬ν [#S05P12C103-86](https://meeting.ssafy.com/s05p11c101/channels/13#)<br/>- λ‘κ·ΈμΈ νλ‘μΈμ€ μ§ν [#S05P12C103-67](https://meeting.ssafy.com/s05p11c101/channels/13#)<br/><br/><br/> **μ΄μ°μ§**<br />- λ©μΈνμ΄μ§ μνλ¦¬μ€νΈ λ°μ΄ν° λ°μΈλ© [#S05P12C103-72](https://jira.ssafy.com/browse/S05P12C103-72)<br />- λ©μΈνμ΄μ§ μνλ¦¬μ€νΈ νλ©΄ κ΅¬μ± [#S05P12C103-87](https://jira.ssafy.com/browse/S05P12C103-87)<br/>- λ°©μ‘λ§λ€κΈ° νμ΄μ§ λΉλκΈ° λμ κ΅¬ν, λ°μ΄ν° λ°μΈλ© [#S05P12C103-75](https://jira.ssafy.com/browse/S05P12C103-75)<br/>- λ°©μ‘λ§λ€κΈ° νμ΄μ§ μλ²μ request&response [#S05P12C103-84](https://jira.ssafy.com/browse/S05P12C103-84)<br/>- λ°©μ‘ λ§λ€κΈ° νλ©΄ κ΅¬μ± [#S05P12C103-66](https://jira.ssafy.com/browse/S05P12C103-66)<br/>- λΌμ΄λΈλ°©μ‘ νλ§€μμ© νλ©΄ κ΅¬μ± [#S05P12C103-71](https://jira.ssafy.com/browse/S05P12C103-71)<br/>- νλ‘μ νΈ κ³΅ν΅ ν°νΈ/μ»¬λ¬/νΌ, λ²νΌ, router-link λμμΈ μ μ© [#S05P12C103-85](https://jira.ssafy.com/browse/S05P12C103-85)<br/> | **κ³΅ν΅**<br />- κΈ°λ₯λͺμΈμ μμ±<br /><br/><br/><br/><br/>**μ΅μ±μ** <br/>- μ¬μ©μκ° μλΉμ€λ₯Ό μ΄μ©νκΈ° μν΄ λ°μ΄ν°λ₯Ό μ μ₯νλ DBλ₯Ό μ€μ νλ€  λ§μ΄νμ΄μ§ responseκ΅¬ν #S05P12C103-86 λ‘κ·ΈμΈ νλ‘μΈμ€ μ§ν<br/> |
| νλ‘μ νΈ μ¬ν κΈ°λ₯ κ°λ°<br />**(v1.1.0)** |  2021.07.19<br />~<br />2021.07.30  | **κΉμ©μ¬**<br/>- νμκ°μ μ ν¨μ± κ²μ¬ [S05P13C103-34](https://jira.ssafy.com/browse/S05P13C103-34)<br/>- μνμ λ³΄ store κ΄λ¦¬ [S05P13C103-30](https://jira.ssafy.com/browse/S05P13C103-30)0<br/>- μ μ  λλ€μ store κ΄λ¦¬ [S05P13C103-24](https://jira.ssafy.com/browse/S05P13C103-24)<br/>- μν μμΈνμ΄μ§μ μν μ΄λ―Έμ§λ₯Ό μΌλ‘μ €λ‘ λμ [#S05P13C103-53](https://jira.ssafy.com/browse/S05P13C103-53)<br/>- μν λ±λ‘νμ΄μ§μ μ¬μ§ μλ‘λ [#S05P13C103-51](https://jira.ssafy.com/browse/S05P13C103-51)<br/>- μν λ±λ‘νμ΄μ§μ μμΈ λ΄μ© μλ ₯ [#S05P13C103-52](https://jira.ssafy.com/browse/S05P13C103-52)<br/>- λ©μΈ νμ΄μ§μ μ΄λ―Έμ§ λ¦¬μ€νΈ λμ°κΈ° [#S05P13C103-47](https://jira.ssafy.com/browse/S05P13C103-47)<br/>- λ‘κ·ΈμΈ νΌ λμμΈ λ° κΈ°λ₯  [#S05P13C103-40](https://jira.ssafy.com/browse/S05P13C103-40)<br/>- νμκ°μ νΌ λμμΈ λ° κΈ°λ₯  [#S05P13C103-42](https://jira.ssafy.com/browse/S05P13C103-42)<br/><br/><br/> **κΉμ°½κ·**<br/>- webRTC κ΅¬ννκΈ°-kurento(node.js) νν λ¦¬μΌ μ€ννκΈ° [S05P13C103-46](https://jira.ssafy.com/browse/S05P13C103-46)<br/>- webRTC κ΅¬ννκΈ°-openvidu νν λ¦¬μΌ μ€ννκΈ° [S05P13C103-37](https://jira.ssafy.com/browse/S05P13C103-37)<br/><br/><br/> **μ΄μ°μ§**<br/>- websocketμ νμ©ν μ€μκ° μ±ν κ΅¬ν [#S05P13C103-17](https://jira.ssafy.com/browse/S05P13C103-17)<br/>- μ€μκ° μ±ν μ μ  λλ€μ μ°λ [#S05P13C103-25](https://jira.ssafy.com/browse/S05P13C103-25)<br />- μ μ  μμ΄λ, λλ€μ localStorageμ storeμμ κ΄λ¦¬ [#S05P13C103-24](https://jira.ssafy.com/browse/S05P13C103-24)<br/>- λΌμ΄λΈλ°©μ‘ νμ΄μ§ νλ§€μμ κ΅¬λ§€μ νλ©΄ κ΅¬λΆ [#S05P13C103-27](https://jira.ssafy.com/browse/S05P13C103-27)<br/>- μνμ λ³΄ storeμμ κ΄λ¦¬ [#S05P13C103-30](https://jira.ssafy.com/browse/S05P13C103-30)<br/>- νμκ°μ μ ν¨μ± κ²μ¬ [#S05P13C103-34](https://jira.ssafy.com/browse/S05P13C103-34)<br/>- λΌμ΄λΈλ°©μ‘ νμ΄μ§ λμμΈ [#S05P13C103-43](https://jira.ssafy.com/browse/S05P13C103-43)<br/>- μΉ΄νκ³ λ¦¬ νμ΄μ§ κ΅¬ν [#S05P13C103-54](https://jira.ssafy.com/browse/S05P13C103-54)<br/>- μ±νλ°© λ³λ‘ μΈμ λ€λ₯΄κ² κ΅¬μ±νμ¬ κ°λ³ μ±νλ°© κ΅¬ν(localStorageμ μ€μκ° μ±ν websocket μΈμ μ λ³΄ μ μ₯, μΈμ μ λ³΄λ‘ μ±νλ°© mapping [#S05P13C103-58](https://jira.ssafy.com/browse/S05P13C103-58)<br/> | **μ΅μ±μ**<br/>- λ§μ΄νμ΄μ§ μνλͺ©λ‘ λ°ν μμ  [#S05P13C103-41] <br/>- λ©μΈνμ΄μ§ response_image [#S05P13C103-32] <br/>- λ°±μλ λ°°ν¬ [#S05P13C103-29] <br/>- μλ§μ‘΄ dbμ°λ [#S05P13C103-26] <br/>- μνμμΈλ³΄κΈ° responseλ³κ²½ [#S05P13C103-23] <br/>- λ‘κ·ΈμΈμ λλ€μλ λ°ν [#S05P13C103-22] <br/>- μνμ λ³΄μ‘°ν μμ  [#S05P13C103-21] <br/>- μ€μκ° μ±ν μΉμμΌ λ°±μλ νμ€νΈ [#S05P13C103-19] |
| νλ‘μ νΈ ν΅μ¬ κΈ°λ₯ κ°λ°<br />**(v1.2.0)** |  2021.08.02<br />~<br />2021.08.20  | **κΉμ©μ¬**<br/>- μν μμΈ μ΄λ―Έμ§ μΊλ‘μ°μ μμ  [#S05P13C103-53](https://jira.ssafy.com/browse/S05P13C103-53)<br/>- μΉ΄λ κ³ λ¦¬ λ³ λΌμ΄λΈλ¦¬μ€νΈ, μνλ¦¬μ€νΈ κ΅¬ν μλ£ [#S05P13C103-54](https://jira.ssafy.com/browse/S05P13C103-54)<br/>- modal μμ  [#S05P13C103-68](https://jira.ssafy.com/browse/S05P13C103-68)<br/>- μν μμΈ νμ΄μ§μμ νλ§€μ€/νλ§€μλ£ νκΈ° [#S05P13C103-75](https://jira.ssafy.com/browse/S05P13C103-75)<br/>- μ°νκΈ° κΈ°λ₯ κ΅¬ν μλ£ [#S05P13C103-85](https://jira.ssafy.com/browse/S05P13C103-85)<br/>- κ²μ κΈ°λ₯ κ΅¬ν μλ£ [#S05P13C103-86](https://jira.ssafy.com/browse/S05P13C103-86)<br/><br/><br/>**μ΄μ°μ§**<br/>- λ©μΈνμ΄μ§ μλΉμ€ μκ° λ°°λ λμμΈ [#S05P13C103-108](https://jira.ssafy.com/browse/S05P13C103-108)<br />- webRTC λΌμ΄λΈ λ°©μ‘μμ νλ§€μ νλ©΄λ§ λ³΄μ΄λλ‘ κ΅¬ν [#S05P13C103-65](https://jira.ssafy.com/browse/S05P13C103-65)<br />- λΌμ΄λΈλ°©μ‘ νμ΄μ§ μ μ μ λ°©μ‘ μμνλλ‘ openvidu μΈμ κ΅¬μ± [#S05P13C103-70](https://jira.ssafy.com/browse/S05P13C103-70)<br/>- λΌμ΄λΈ λ°©μ‘μ’λ£ κ΅¬ν<br/>- λΌμ΄λΈ λ°©μ‘ μ’λ£μ μ’λ£μλ΄μ°½ λμ°κΈ° [#S05P13C103-69](https://jira.ssafy.com/browse/S05P13C103-69)<br />- λΌμ΄λΈλ°©μ‘ μ‘°νμ μΉ΄μ΄ν [#S05P13C103-109](https://jira.ssafy.com/browse/S05P13C103-109)<br/>- μ±νμ°½ μλ μ€ν¬λ‘€ κ΅¬ν [#S05P13C103-91](https://jira.ssafy.com/browse/S05P13C103-91)<br/>- μΌλμΌμ±ν μ΄μ  λνλ΄μ­ μΆλ ₯ [#S05P13C103-88](https://jira.ssafy.com/browse/S05P13C103-88)<br/>- μΌλμΌμ±ν μ μ  λλ€μ query μ²λ¦¬νμ¬ μλ‘κ³ μΉ¨ μμλ λ°μ΄ν° μ μ§ [#S05P13C103-87](https://jira.ssafy.com/browse/S05P13C103-87)<br/>- μ‘΄μ¬νμ§ μλ λΌμ΄λΈλ°©μ‘ url μ μμ μλ΄μ°½ λμ°κΈ°, μ‘΄μ¬νλ λΌμ΄λΈ μ£Όμλ‘λ§ μ μ κ°λ₯νλλ‘ κ΅¬μ± [#S05P13C103-98](https://jira.ssafy.com/browse/S05P13C103-98)<br/>- μ€ν¬λ‘€λ° λμμΈ [#S05P13C103-96](https://jira.ssafy.com/browse/S05P13C103-96)<br/>- footer, λ°©μ‘λ§λ€κΈ°, λ°©μ‘μμ²­νμ΄μ§ λμμΈ, λΉλμ€ ν΄μλ μ‘°μ  [#S05P13C103-92](https://jira.ssafy.com/browse/S05P13C103-92)<br/>- μΌλμΌμ±ν url λ³κ²½, λ‘κ·ΈμΈ μμλ§ μ΄μ©κ°λ₯νλλ‘ κ΅¬μ±, websocketμ νμ©ν μ€μκ° μ±ν κ΅¬ν, μ±νμ°½ λμμΈ [#S05P13C103-74](https://jira.ssafy.com/browse/S05P13C103-74)<br/>- openvidu μ½μμ°½ λ©μΈμ§ μλ³΄μ΄κΈ° [#S05P13C103-110](https://jira.ssafy.com/browse/S05P13C103-110)<br/>- λ©μΈ,μΉ΄νκ³ λ¦¬ νμ΄μ§ μν λͺ©λ‘ λμμΈ μμ (λ°μν, μ λ ¬, μΈλΆλμμΈ) [#S05P13C103-111](https://jira.ssafy.com/browse/S05P13C103-111)<br/>- λ©μΈ,μΉ΄νκ³ λ¦¬ νμ΄μ§ λΌμ΄λΈ λͺ©λ‘ λμμΈ μμ (λ°μν, μ΄λ―Έμ§ λμ΄μ§λ λ¬Έμ , CSS) [#S05P13C103-112](https://jira.ssafy.com/browse/S05P13C103-112)<br/>- λ§μ΄νμ΄μ§, νλ‘ννμ΄μ§ λμμΈ μμ  [#S05P13C103-113](https://jira.ssafy.com/browse/S05P13C103-113)<br/>- λͺ¨λ¬ μ»΄ν¬λνΈ μ¬μ¬μ©ν  μ μλλ‘ μμ  [#S05P13C103-68](https://jira.ssafy.com/browse/S05P13C103-68)<br />- λΉλ‘κ·ΈμΈ μνμμ λΌμ΄λΈλ°©μ‘ μμ²­ μλ¬ ν΄κ²°(μ μ  μμ΄λκ°μ΄ μμ κ²½μ° λΉκ°λ³΄λ΄λ κ±Έλ‘ λ³κ²½) [#S05P13C103-118](https://jira.ssafy.com/browse/S05P13C103-118)<br/>- κ²μ μλ¬ ν΄κ²°(κ²μ url, params λ³κ²½) [#S05P13C103-119](https://jira.ssafy.com/browse/S05P13C103-119)<br/>- μνμμΈνμ΄μ§μμ μ±νμμμ μνλͺ λ°μΈλ© μλ¬ ν΄κ²° [#S05P13C103-120](https://jira.ssafy.com/browse/S05P13C103-120)<br/>- Frontend λ°°ν¬ [#S05P13C103-107](https://jira.ssafy.com/browse/S05P13C103-107)<br/> | **μ΅μ±μ**<br/>- DB μ΄κΈ°ν: μΉνμ΄μ§μμ κ΅¬νλ κΈ°λ₯μΌλ‘ λλ―Έλ°μ΄ν° μλ ₯ [#S05P13C103-47](https://jira.ssafy.com/browse/S05P13C103-47)<br/>- ERD νμ΄λΈμ λ§κ² μ½λ μμ  [#S05P13C103-79](https://jira.ssafy.com/browse/S05P13C103-79)<br/>- μΌλμΌ μ±ν Stomp κ΅¬ν  [#S05P13C103-55](https://jira.ssafy.com/browse/S05P13C103-55)<br/>- 1λ1 μ±νμμ νλ§€ μλ£ κ΅¬ν [#S05P13C103-63](https://jira.ssafy.com/browse/S05P13C103-63)<br/>- κ²μκΈ°λ₯ κ΅¬ν [#S05P13C103-60](https://jira.ssafy.com/browse/S05P13C103-60)<br/>- λ©μΈνμ΄μ§μ λΌμ΄λΈλ¦¬μ€νΈ [#S05P13C103-61](https://jira.ssafy.com/browse/S05P13C103-61)<br/>- μΉ΄νκ³ λ¦¬λ³ λΌμ΄λΈλ°©μ‘, μνμ λ³΄ [#S05P13C103-64](https://jira.ssafy.com/browse/S05P13C103-64)<br/>- 1λ1 μ±ν κ΅¬ν [#S05P13C103-72](https://jira.ssafy.com/browse/S05P13C103-72)<br/>- μ°νκΈ° κ΅¬ν [#S05P13C103-73](https://jira.ssafy.com/browse/S05P13C103-73)<br/>- λ°©μ‘μ’λ£ κ΅¬ν [#S05P13C103-89](https://jira.ssafy.com/browse/S05P13C103-89)<br />- Backend λ°°ν¬[#S05P13C103-106](https://jira.ssafy.com/browse/S05P13C103-106)<br/> |

<br>

---

## π νλ‘μ νΈ μ°μΆλ¬Ό

- [UCC](./docs/video/UCC.mp4)
- [μμ°μμ](./docs/video/μμ°.mp4)
- [λ°ν PPT](./docs/λ°νppt.pdf)
- [ERD](./docs/image/erd.png)
- [Component](./docs/image/component.png)

<br>

## π Project ProgressStatus

| κ΅¬λΆ         | λ§ν¬                                                         |
| ------------ | ------------------------------------------------------------ |
| Team Notionπ£ | [Team Notion](https://www.notion.so/74deb92179b54a66a10d6cfa45c10766) |
| JIRAπ₯        | [SSAFY-JIRA](https://jira.ssafy.com/projects/S05P13C103)     |
| GitLabπ      | [SSAFY-GitLab](https://lab.ssafy.com/s05-webmobile1-sub3/S05P13C103) |
| REST Docsπ   | [Postman_RESTDocs](https://documenter.getpostman.com/view/3490568/TzsWuARM) |

- μΌλΆ λ§ν¬λ λ³΄μλ¬Έμ λ‘ μ΄λμ΄ λΆκ°λ₯ ν  μ μμ΅λλ€. 
  μμ²­μ(cse.it0516@gmail.com)μ ν΅νμ¬ μ°λ½μ£Όμλ©΄ μ΄λκΆν λλ¦¬κ² μ΅λλ€.

