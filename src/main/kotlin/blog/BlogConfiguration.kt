package blog

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BlogConfiguration {

    @Bean
    fun databaseInitializer(userRepository: UserRepository,
                            articleRepository: ArticleRepository) = ApplicationRunner {

        val syanagihara = userRepository.save(User("syanagihara", "Shinya", "Yanagihara"))
        articleRepository.save(Article(
                title = "1月の貿易収支、1兆4152億円の赤字　対中輸出17%減",
                headline = "財務省が20日発表した1月の貿易統計速報（通関ベース）によると...",
                content = "財務省が20日発表した1月の貿易統計速報（通関ベース）によると、輸出額から輸入額を差し引いた貿易収支は1兆4152億円の赤字だった",
                author = syanagihara
        ))
        articleRepository.save(Article(
                title = "マネー再び「緩和モード」　新興国債などに流入加速",
                headline = "金融市場が再び「緩和相場」を試し始めた。米国の利上げ路線...",
                content = "金融市場が再び「緩和相場」を試し始めた。米国の利上げ路線修正を起点に緩和的な金融政策が広がり、資金の調達環境が緩んでいる",
                author = syanagihara
        ))
    }
}
