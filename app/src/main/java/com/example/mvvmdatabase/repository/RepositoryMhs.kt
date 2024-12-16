package com.example.mvvmdatabase.repository

import com.example.mvvmdatabase.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {

    // method ini untuk memanggil fungsi geetAllMahasiswa dari mahasiswaDao untuk
    //mendapatkan semua data dlm bentuk aliran
    fun getAllMhs() : Flow<List<Mahasiswa>>
    //method ini untuk memanggil fungsi geetAllMahasiswa dari mahasiswaDao berdasarkan NIM
    fun getMhs(nim: String) : Flow<List<Mahasiswa>>

    //Method ini memanfaatkan fungsi insertMahasiswa dari MahasiswaDao
    suspend fun insertMhs(mahasiswa: Mahasiswa)

    //Method ini memanfaatkan fungsi deleteMahasiswa dari MahasiswaDao
    suspend fun deleteMhs(mahasiswa: Mahasiswa)

    //Method ini memanfaatkan fungsi updateMahasiswa dari MahasiswaDao
    suspend fun updateMhs(mahasiswa: Mahasiswa)


}