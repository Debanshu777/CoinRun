package com.debanshu777.coinrun.repository

import com.debanshu777.coinrun.db.Run
import com.debanshu777.coinrun.db.RunDAO
import javax.inject.Inject


class MainRepository @Inject constructor(
    val runDao:RunDAO
) {
    suspend fun insertRun(run:Run)=runDao.insertRun(run)
    suspend fun deleteRun(run:Run)=runDao.insertRun(run)

    fun getAllRunsSortedByDate() = runDao.getAllRunsSortedByDate()
    fun getAllRunsSortedByDistance() = runDao.getAllRunsSortedByDistanceInMeters()
    fun getAllRunsSortedByTimeInMillis() = runDao.getAllRunsSortedByTimeInMillis()
    fun getAllRunsSortedByAvgSpeed() = runDao.getAllRunsSortedByAvgSpeed()
    fun getAllRunsSortedByCaloriesBurned() = runDao.getAllRunsSortedByCaloriesBurned()

    fun getTotalAvgSpeed()=runDao.getTotalAvgSpeed()
    fun getTotalDistance()=runDao.getTotalDistance()
    fun getTotalCaloriesBurned()=runDao.getTotalCaloriesBurned()
    fun getTotalTimeInMillis()=runDao.getTotalTimeInMillis()
}