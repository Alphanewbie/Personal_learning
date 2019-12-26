--1. ��� ���̺��� ����Ʈ�� ����Ͻÿ�.
select * 
from tab;

--2. emp ���̺�� dept ���̺��� ������ ����Ͻÿ�.
desc emp;
desc dept;

--3. ���(emp)���̺��� ��� �����͸� ����Ͻÿ�.
select * 
from emp;

--4. ������̺��� �����ȣ, ����̸�, ������ ����Ͻÿ�.
select empno,ename,sal 
from emp;

--5. ������̺��� ���޿��� �̴µ� �ߺ��� �����Ͱ� ���� ����Ͻÿ�.
select DISTINCT sal
from emp;

--6. ������̺��� ����̸��� ������ ����ϴµ� ������ �÷�����
-- "�� ��","�� ��"���� �ٲ㼭 ����Ͻÿ�. ��, ALIAS�� ���� �߰�
select ename AS "�� ��",sal AS "�� ��"
from emp;

--7. ������̺��� ����̸�, ������ �̰�, ���ް� Ŀ�̼���  ���� ����
-- ����ϴµ� �÷����� '�Ǳ޿�'�̶�� �ؼ� ����Ͻÿ�.
-- ��, NULL���� ��Ÿ���� �ʰ� �Ͻÿ�.(Ŀ�̼� �ȹ޴»������)
select sal + comm AS "�Ǳ޿�"
from emp
where sal + comm is NOT null;

--8. ������̺��� 'SCOTT'�̶�� ����� �����ȣ, �̸�, ������ ����Ͻÿ�.
select empno,ename,sal
from emp
where ename = 'FORD';

--9. ������̺��� ������ 'SALESMAN'�� ����� �����ȣ, �̸�, ������
-- ����Ͻÿ�.

select empno,ename,job
from emp
where job = 'SALESMAN';

--10. ������̺��� �����ȣ�� 7499, 7521, 7654�� ����� �����ȣ, �̸�
-- ������ ����Ͻÿ�.
select empno,ename,sal
from emp
where empno IN (7499, 7521, 7654);

--11. ������̺��� ������ 1500���� 3000������ ����� �����ȣ, �̸�,
-- ������ ����Ͻÿ�.
select empno,ename,sal
from emp
where sal BETWEEN 1500 AND 3000;

--12. ��� ���̺��� �μ� ��ġ�� ���� ���� ������ �̸��� ����Ͻÿ�.
select ename
from emp
where MGR is null;


--13. ������̺��� ������ ���� ������ ��� ������ ����Ͻÿ�.

select *
from emp
ORDER by sal desc;

--14. ������̺��� ������ �̸��� �Ի����� ����ϴµ� �ֱٿ� �Ի��� ������ ����Ͻÿ�.
select ename,hiredate
from emp
ORDER by hiredate asc;

--15. ��� ���̺��� 30�� �μ��� �ٹ��ϴ� �������� �̸��� ����ϴµ�
-- �Ի����� ������ ������ ����Ͻÿ�.

select ename
from emp
WHERE deptno = 30
ORDER by hiredate desc;

