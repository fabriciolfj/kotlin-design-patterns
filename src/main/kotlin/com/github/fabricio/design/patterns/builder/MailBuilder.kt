package com.github.fabricio.design.patterns.builder

class MailBuilder {
    private lateinit var email: String
    private var title: String? = null
    private var body: String? = null

    data class Mail internal constructor(val email: String, var title: String?, var body: String?)

    fun body(body: String?) : MailBuilder {
        this.body = body
        return this
    }

    fun email(email: String) : MailBuilder{
        this.email = email
        return this
    }

    fun title(title: String) : MailBuilder {
        this.title = title
        return this
    }

    fun build() : Mail {
        return Mail(this.email, this.title, this.body)
    }
}