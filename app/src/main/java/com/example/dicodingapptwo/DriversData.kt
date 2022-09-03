package com.example.dicodingapptwo

object DriversData {
    private val driverNames = arrayOf(
        "Max Verstappen",
        "Sergio Perez",
        "Charles Leclerc",
        "Carlos Sainz",
        "George Russell",
        "Lewis Hamilton",
        "Lando Norris",
        "Esteban Ocon",
        "Fernando Alonso",
    "Valtteri Bottas")

    private val driverDetails = arrayOf("He’s Max by name, and max by nature.\n" +
            "\n" +
            "Arriving as Formula 1’s youngest ever competitor at just 17 years old, Verstappen pushed his car, his rivals and the sport’s record books to the limit. The baby-faced Dutchman with the heart of a lion took the Toro Rosso – and then the Red Bull – by the horns with his instinctive racing style.\n" +
            "\n" +
            "F1’s youngest points scorer soon became its youngest race winner – at the age of 18 years and 228 days – with an opportunistic but controlled drive on debut for Red Bull in Barcelona 2016. A true wheel-to-wheel racer, another stunning drive in Brazil from the back of the pack to the podium on a treacherous wet track kept the plaudits coming.\n" +
            "\n" +
            "Verstappen’s no-holds-barred attitude and hard defending have sometimes landed him in hot water with his peers and paymasters. But the mistakes that initially marred his potential have given way to maturity, while the bravado and energy that make him a blockbuster talent have remained – and the victories have kept on coming, culminating in his first F1 drivers’ title following that already legendary, final-round showdown with Lewis Hamilton in 2021.\n" +
            "\n" +
            "The son of former F1 driver Jos Verstappen and super-quick karting Mum Sophie Kumpen, racing runs through his genes. Despite moving out of Dad’s house to live in Monaco, Verstappen remains close to his family, and though he’s not afraid to speak his mind, he can still be surprisingly shy.\n" +
            "\n" +
            "Having become the Netherlands' first world champion aged just 24, the expectations for the next generation’s leading light are sky high – but with Verstappen there’s a feeling that the sky’s the limit.",
        "He’s the fighter with a gentle touch from the land of the Lucha Libre.\n" +
                "\n" +
                "Perez’s reputation in F1 has been built on opposite approaches to Grand Prix racing. On the one hand, he is a punchy combatant who wrestles his way through the pack and into the points. Never afraid to add a bit of spice to his on-track encounters, even his team mates don’t always escape the Mexican’s heat.\n" +
                "\n" +
                "Then on the other hand, Perez is a smooth operator, a master at managing tyres to eke out extra performance and give him the upper hand on strategy. A firm favourite on the grid after his time with Sauber, McLaren, Force India and Racing Point, Perez has matured into an analytical racer and team player.\n" +
                "\n" +
                "A proud countryman, the Guadalajara gunslinger has amassed more points than any other Mexican in the history of F1. In Sakhir 2020 he also matched hero and compatriot Pedro Rodriguez by taking the chequered flag in first – a performance that landed him a seat with title contenders Red Bull.\n" +
                "\n" +
                "There he provided strong support to Max Verstappen’s 2021 championship-winning campaign, also adding another victory to his own tally. More wins may not be assured, especially with Verstappen as team mate, but Perez working hard and racing with his heart are.",
        "Born in the Mediterranean idyll of Monaco, Leclerc arrived in F1 on a tidal wave of expectation. \n" +
                "\n" +
                "Practically peerless on his way to the GP3 and Formula 2 crowns, he showcased a dazzling array of skills from scorching pole positions, commanding victories – even when his car caught fire twice at Silverstone – to an ability to muscle his way through the pack. Winning back-to-back championships also taught Leclerc how to handle pressure, another useful tool in the big pond of Formula 1 racing.\n" +
                "\n" +
                "Stepping up to F1 in 2018, Leclerc showed flashes of ballistic pace on Saturdays and racing brilliance on Sundays, dragging his Sauber beyond its limits – and earning himself a money-can’t-buy race seat at Ferrari for 2019, stepping into the shoes of the Scuderia’s last world champion, Kimi Raikkonen. \n" +
                "\n" +
                "There he immediately put the cat among the proverbial pigeons, unafraid to go wheel-to-wheel with established number one, Sebastian Vettel. A maiden F1 victory at Spa was followed by another a week later on Ferrari’s hallowed home turf of Monza. The tifosi had found another new hero – who then became the first man to out-score Vettel over a season with the Scuderia, a feat he repeated in crushing fashion the following year.\n" +
                "\n" +
                "Out of the car, Leclerc is modest and thoughtful - but then he is on his own very personal mission. This exciting young talent is racing for his late father Herve and his friend and mentor Jules Bianchi, the F1 driver who died in 2015. \n" +
                "\n" +
                "On the evidence so far, he is doing them both proud.",
        "He’s the matador from Madrid racing royalty. \n" +
                "\n" +
                "After entering F1’s Bull Ring paired alongside Max Verstappen at Toro Rosso in 2015, Sainz quickly showed his fighting spirit. A tenacious racer, he puts the car on the edge as he hustles his way through the pack. No wonder Sainz has earned the nickname Chilli.\n" +
                "\n" +
                "But the Spaniard is intelligent as well as instinctive, thinking his way through a race and into the points. This calm temperament follows him off track where he remains unfazed by the pressures of forging a Grand Prix career with a famous name. \n" +
                "\n" +
                "Sainz is the son of double World Rally champion, also his namesake, and has brought some of Dad’s driving skills to the F1 circuit – junior loves a delicious dose of drift for one. \n" +
                "\n" +
                "After following in his famous father’s tyre tracks, Sainz has had big racing boots to fill – first at McLaren where he replaced his childhood hero Fernando Alonso, and now at Ferrari, in the seat formerly owned by Sebastian Vettel. It is never easy living in the shadow of sporting giants, but Sainz has shown the drive and disposition to deal with it. Vamos!",
        "He’s the driver with the motto: “If in doubt, go flat out”.\n" +
                "\n" +
                "George Russell has lived by it in his F1 career to date, out-qualifying seasoned team mate Robert Kubica at all 21 Grands Prix in his rookie season, putting Williams back on the podium in 2021, and landing a Mercedes race seat alongside Lewis Hamilton for 2022.\n" +
                "\n" +
                "That brilliant baseline speed served Russell well as he totted up titles on his way to Formula 1. The Briton stormed to the 2017 GP3 championship and delivered the 2018 Formula 2 crown under immense pressure.\n" +
                "\n" +
                "Spotting his potential, world champions Mercedes swooped to sign him to their junior programme in 2017, when Russell already had a DTM deal on the table. He banked more experience with practice sessions with Force India and tests for the Silver Arrows, before landing his Mercedes-powered Williams race drive.\n" +
                "\n" +
                "A refusal to cede ground to his rivals - and commitment to a tricky pass – underpins Russell’s winning mentality. And it’s what got him the call-up to replace Lewis Hamilton for a one-off Mercedes appearance for Sakhir 2020 when the reigning champ was struck down by Covid-19.\n" +
                "\n" +
                "That star turn saw Russell miss out on pole by just 0.026s and then outrace Mercedes stalwart Valtteri Bottas. Only a bungled pit stop and a heart-breaking late puncture prevented a near-certain maiden win for the up-and-coming super-sub.  \n" +
                "\n" +
                "He kept his head down at Williams in 2021, scoring his first points and podium, all the while keeping his eye on the bigger prize. Having proved himself a hard worker and a tenacious talent, that prize arrived in the form of a chance to take on compatriot and seven-time champion Hamilton in identical machinery.\n" +
                "\n" +
                "A huge challenge, but as always, ‘Russell the Rocket’ will be going flat out.",
        "‘Still I Rise’ – these are the words emblazoned across the back of Lewis Hamilton’s helmet and tattooed across his shoulders, and ever since annihilating expectations with one of the greatest rookie performances in F1 history in 2007, that’s literally all he’s done: risen to the top of the all-time pole positions list ahead of his hero Ayrton Senna, surged into first place in the wins column surpassing the inimitable Michael Schumacher, and then matched the legendary German’s seven world titles.\n" +
                "\n" +
                "Is he the G.O.A.T? Few would deny that he’s in the conversation – and what’s more he’s got there his way, twinning his relentless speed with a refusal to conform to stereotypes for how a racing driver should think, dress or behave.\n" +
                "\n" +
                "Respect is hard earned in F1, but Hamilton – now Sir Lewis Hamilton to be precise – has it from every one of his peers. Why? Because they know that whatever the track, whatever the conditions, whatever the situation, when his visor goes down and the lights go out, it’s Hammertime.",
        "Lando Norris may not be named after Star Wars rebel Lando Calrissian - his Mum just liked the moniker - but he has flair and fighting spirit in bountiful supply.\n" +
                "\n" +
                "McLaren had the British teenager on their books for two years before fast-tracking him into F1’s galaxy of stars in 2019. A firecracker in his junior career, with a penchant for pole positions and wheel-to-wheel tussles, Norris didn’t let them down.\n" +
                "\n" +
                "Paired with the highly-rated – and far more experienced – Carlos Sainz, his rookie season was impressive, edging the Spaniard in their head-to-head qualifying battle, scoring points on 11 occasions, and only narrowly missing out on a top-10 championship placing. It was a similar pattern in 2020, with the affable Brit securing a maiden podium and moving up to ninth overall.\n" +
                "\n" +
                "His unstoppable rise continued in 2021, with a further four podiums and almost a race win as he dominated another more senior team mate, Daniel Ricciardo, to move up to P6 in the final driver standings.\n" +
                "\n" +
                "An exciting talent on track, away from it Norris brims with a modest charm and an artistic side sees him design and paint his own race gear as a hobby. The focus for the future is allying artistry and ambition on track as McLaren rely on the promise of youth to take them back to the top.\n" +
                "\n" +
                "Norris hopes the downforce will be with him…",
        "If there’s one word that dominates Esteban Ocon’s career, it’s ‘sacrifice’.\n" +
                "\n" +
                "Back when he was just a promising karter, Ocon’s parents sold their house, put their jobs on hold, and began a life on the road, living in a caravan and travelling from circuit to circuit to support their son’s burgeoning career.\n" +
                "\n" +
                "Sacrifice, see – but it worked. 2014 saw Ocon break through in the world of single-seaters, as he beat a certain Max Verstappen to the European F3 title. Backed by Mercedes, he won the GP3 title the following year and was halfway through a season of DTM in 2016 when he was offered the chance to replace Rio Haryanto at the minnow Manor team from the Belgian Grand Prix onwards.\n" +
                "\n" +
                "That opportunity led to a full-time seat the following year with Force India, where his wheel-to-wheel duels with highly-rated team mate Sergio Perez quickly marked him out as a rising star. But when Lawrence Stroll, father of racer Lance, stepped in midway through 2018 to secure the squad’s financial future, the writing was on the wall for Ocon, who was moved aside at the end of the year to allow Stroll Jnr to join from Williams.\n" +
                "\n" +
                "Ocon bided his time, though, and after a year on the sidelines as Mercedes’ reserve driver, he found his way back into a race seat for 2020 with Renault, who became Alpine for 2021 – when his wait finally paid off, as he scored his – and the famous French marque’s – first F1 win.\n" +
                "\n" +
                "Nothing in Ocon’s motorsport career has come easy – but if Ocon has managed to return to the F1 grid and step atop the podium, it’s through a combination of self-belief, determination and a talent that’s up there with the very best.",
        "Michael Schumacher was the undisputed king of Formula 1 in the early 2000s, picking up wins and championships at a rate that was simply unheard of at the time. It was going to take someone very special to topple the Ferrari legend from his throne – and that it was Fernando Alonso who did it, tells you all you need to know about the Spaniard.\n" +
                "\n" +
                "Fiercely competitive, Alonso is not shy about his talent, rating himself as 9/10 “in everything”, and few in the know would disagree, with his performances in F1 characterised by blistering speed, brilliant tactical thinking, exemplary race craft, a razor-sharp eye for detail and a relentless determination to win.\n" +
                "\n" +
                "A serial record breaker in his early days, he was – at one time – F1’s youngest polesitter, race winner, world champion and double world champion as he gobbled up success with the Renault team. Even Alonso couldn’t continue that amazing run in his later career though, failing to add another title to his collection despite spells at McLaren and Ferrari.\n" +
                "\n" +
                "But after two years away from Formula 1 racing – and with two Le Mans wins in his pocket – Alonso returned with Alpine in 2021. And he has unfinished business with F1…",
        "Learning his craft on Finnish roads of ice and snow, he was born to be a Grand Prix racer.\n" +
                "\n" +
                "Bottas explains that if you can drive on the frozen roads of his homeland then you can drive anywhere. Then there’s the Finnish mentality –reserved, diligent and calm the fast lane of F1 doesn’t faze him.\n" +
                "\n" +
                "Making his F1 debut with Williams in 2013, Bottas soon became part of the family. Points and podiums followed with the reliable racer even amassing the most points without a win, a record he resented but that showcased his ability. The fact the Finn was such a points machine saw him suddenly promoted to the most coveted seat in F1 - Nico Rosberg’s vacant championship-winning seat at Mercedes.\n" +
                "\n" +
                "Bottas blossomed at the Silver Arrows in 2017, unleashing his pace to clock up personal pole positions and victories as well as a team championship for the famous Mercedes marque alongside Lewis Hamilton. He even tied with Hamilton and Sebastian Vettel with 13 podiums.\n" +
                "\n" +
                "For a shy guy, it brought a confidence boost and a new swagger – albeit in a very demur Finnish fashion. He would need all that confidence in 2018 – a season Bottas described as his worst in F1, as he took zero wins to Hamilton’s 11. That, though, was a reflection more of his team mate’s brilliance than of any shortcomings on his own part.\n" +
                "\n" +
                "Bottas stepped it up a level in 2019, four victories securing a convincing second in the championship behind Hamilton, but that dropped to two wins to his team mate's 11 in 2020 and then just one in 2021, prompting Mercedes to drop him after five seasons.\n" +
                "\n" +
                "For 2022 he starts a new chapter in his F1 career, replacing compatriot Kimi Raikkonen to lead an all-new line-up at Alfa Romeo, where he is charged with taking Chinese rookie Zhou Guanyu under his wing.")

    private val driverImages = intArrayOf(R.drawable.max_verstappen,
        R.drawable.sergio_perez,
        R.drawable.charles_leclerc,
        R.drawable.carlos_sainz,
        R.drawable.george_russell,
        R.drawable.lewis_hamilton,
        R.drawable.lando_norris,
        R.drawable.esteban_ocon,
        R.drawable.fernando_alonso,
        R.drawable.valtteri_bottas)

    val listData: ArrayList<Driver>
        get() {
            val list = arrayListOf<Driver>()
            for (position in driverNames.indices) {
                val driver = Driver()
                driver.name = driverNames[position]
                driver.detail = driverDetails[position]
                driver.photo = driverImages[position]
                list.add(driver)
            }
            return list
        }
}