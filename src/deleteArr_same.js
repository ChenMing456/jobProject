/**
 * Created by С�� on 2017/8/25.
 *
 */
// �������ȥ�ط�

function dele_1(array){
    var n = [];//һ���µ���ʱ����
//������ǰ����
for(var i = 0; i < array.length; i++){
//�����ǰ����ĵ�i�Ѿ����������ʱ���飬��ô������
//����ѵ�ǰ��push����ʱ��������

    //indexOf��ʾ�״γ��ֵ�λ�ã���Ϊ-1�����ʾǰ�����ɵ�n�����л�û�е�ǰԪ�أ����Խ���push��ȥ
        if(n.indexOf(array[i]) == -1)
            n.push(array[i]);
    }
    return n;
}

// 2.�����ֵ�Է�
// �÷���ִ�е��ٶȱ������κη������죬 ����ռ�õ��ڴ��һЩ��
// ʵ��˼·���½�һjs�����Լ������飬������������ʱ���ж�ֵ�Ƿ�Ϊjs����ļ���
// ���ǵĻ������������ü������������顣
// ע�� �㣺 �ж��Ƿ�Ϊjs�����ʱ�����Զ��Դ���ļ�ִ�С�toString()����
// ��ͬ�ļ����ܻᱻ����Ϊһ�������磺 a[1]��a["1"] ������������⻹�ǵõ��á�indexOf����
// �ٶ���죬 ռ�ռ���ࣨ�ռ任ʱ�䣩
function unique2(array){
    var n = {}, r = [], val, type;
    for (var i = 0; i < array.length; i++) {
        val = array[i];
        type = typeof val;
        if (!n[val]) {
            n[val] = [type];
            r.push(val);
        } else if (n[val].indexOf(type) < 0) {
            n[val].push(type);
            r.push(val);
        }
    }
    return r;
}