package us.bojie.mvvmbasicaac.ui.quotes

import androidx.lifecycle.ViewModel
import us.bojie.mvvmbasicaac.data.Quote
import us.bojie.mvvmbasicaac.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {
    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}