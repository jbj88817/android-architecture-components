package us.bojie.mvvmbasicaac.utils

import us.bojie.mvvmbasicaac.data.FakeDatabase
import us.bojie.mvvmbasicaac.data.QuoteRepository
import us.bojie.mvvmbasicaac.ui.quotes.QuotesViewModelFactory

object InjectorUtils {
    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}