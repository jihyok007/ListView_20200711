package kr.co.tjoeun.listview_20200711

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.listview_20200711.adapters.StudentAdapter
import kr.co.tjoeun.listview_20200711.datas.Student

class MainActivity : AppCompatActivity() {

//    학생 데이터를 담고 있는 목록
    val mStudentList = ArrayList<Student>()

//    목록에 담긴 데이터를 뿌려주는 어댑터
    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(Student("조경진", "서울시 은평구", 1988))
        mStudentList.add(Student("김문기", "경기도 남양주시", 1994))
        mStudentList.add(Student("오윤도", "경기도 남양주시", 1997))
        mStudentList.add(Student("이진슬", "서울시 강서구", 1994))
        mStudentList.add(Student("최지혁", "서울시 강동구", 1992))
        mStudentList.add(Student("최현일", "경기도 남양주시", 1990))
        mStudentList.add(Student("황선혜", "서울시 금천구", 1996))

        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)
        studentListView.adapter = mAdapter

    }
}