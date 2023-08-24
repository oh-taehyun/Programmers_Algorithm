--보호소에 들어온 동물 중 이름에 "EL"이 들어가는 개의 아이디와 이름을 조회하는 sql
--이름의 대소문자는 구분하지 않는다. -> where 조건에 이름을 모두 대문자로 바꾼후 EL을 포함하는 동물 중 개 'Dog'인 아이디를 찾는다.
SELECT animal_id, name FROM animal_ins where upper(name) like '%EL%' AND animal_type ='Dog' ORDER BY name; 