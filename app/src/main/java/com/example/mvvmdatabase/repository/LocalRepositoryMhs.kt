package com.example.mvvmdatabase.repository

import com.example.mvvmdatabase.data.dao.MahasiswaDao
import com.example.mvvmdatabase.data.entity.Mahasiswa

class LocalRepositoryMhs(
    private val mahasiswaDao: MahasiswaDao
): RepositoryMhs{
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }
}