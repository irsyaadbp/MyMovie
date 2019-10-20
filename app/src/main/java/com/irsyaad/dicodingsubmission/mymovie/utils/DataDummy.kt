package com.irsyaad.dicodingsubmission.mymovie.utils

import com.irsyaad.dicodingsubmission.mymovie.data.DataEntity

object DataDummy {
    fun generateDummyMovies(): ArrayList<DataEntity> {
        val movies = ArrayList<DataEntity>()

        movies.add(
            DataEntity(
                "m10",
                "Aladdin",
                "A kindhearted street urchin named Aladdin embarks on a magical adventure after finding a lamp that releases a wisecracking genie while a power-hungry Grand Vizier vies for the same lamp that has the power to make their deepest wishes come true.",
                "https://image.tmdb.org/t/p/w185/3iYQTLGoy7QnjcUYRJy4YrAgGvp.jpg",
                "ADVENTURE, FANTASY, ROMANCE",
                "7.4",
                "2019",
                "2h 10m"
            )
        )
        movies.add(
            DataEntity(
                "m11",
                "Avengers: Infinity War",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                "https://image.tmdb.org/t/p/w185/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg",
                "ADVENTURE, ACTION, FANTASY",
                "8.5",
                "2018",
                "2h 29m"
            )
        )
        movies.add(
            DataEntity(
                "m12",
                "Spider-Man: Into the Spider-Verse",
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                "https://image.tmdb.org/t/p/w185/iiZZdoQBEYBv6id8su7ImL0oCbD.jpg",
                "ACTION, ADVENTURE, ANIMATION",
                "8.5",
                "2018",
                "1h 57m"
            )
        )
        movies.add(
            DataEntity(
                "m13",
                "A Star Is Born",
                "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                "https://image.tmdb.org/t/p/w185/wrFpXMNBRj2PBiN4Z5kix51XaIZ.jpg",
                "DRAMA, ROMANCE, MUSIC",
                "7.7",
                "2018",
                "2h 15m"
            )
        )
        movies.add(
            DataEntity(
                "m14",
                "Alita: Battle Angel ",
                "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                "https://image.tmdb.org/t/p/w185/xRWht48C2V8XNfzvPehyClOvDni.jpg",
                "ACTION, SCIENCE FICTION, THRILLER",
                "7.5",
                "2019",
                "2h 2m"
            )
        )
        movies.add(
            DataEntity(
                "m15",
                "Bohemian Rhapsody",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                "https://image.tmdb.org/t/p/w185/lHu1wtNaczFPGFDTrjCSzeLPTKN.jpg",
                "DRAMA, MUSIC",
                "8.0",
                "2018",
                "2h 15m"
            )
        )
        movies.add(
            DataEntity(
                "m16",
                "Incredibles 2",
                "Elastigirl springs into action to save the day, while Mr. Incredible faces his greatest challenge yet – taking care of the problems of his three children.",
                "https://image.tmdb.org/t/p/w185/9lFKBtaVIhP7E2Pk0IY1CwTKTMZ.jpg",
                "ACTION, ADVENTURE, ANIMATION, FAMILY",
                "7.7",
                "2018",
                "1h 58m"
            )
        )
        movies.add(
            DataEntity(
                "m17",
                "Spider-Man: Far from Home",
                "Peter Parker and his friends go on a summer trip to Europe. However, they will hardly be able to rest - Peter will have to agree to help Nick Fury uncover the mystery of creatures that cause natural disasters and destruction throughout the continent.",
                "https://image.tmdb.org/t/p/w185/rjbNpRMoVvqHmhmksbokcyCr7wn.jpg",
                "ACTION, ADVENTURE,SCIENCE FICTION",
                "7.7",
                "2019",
                "2h 9m"
            )
        )
        movies.add(
            DataEntity(
                "m18",
                "Toy Story 4",
                "Woody has always been confident about his place in the world and that his priority is taking care of his kid, whether that's Andy or Bonnie. But when Bonnie adds a reluctant new toy called \"Forky\" to her room, a road trip adventure alongside old and new friends will show Woody how big the world can be for a toy.",
                "https://image.tmdb.org/t/p/w185/w9kR8qbmQ01HwnvK4alvnQ2ca0L.jpg",
                "ADVENTURE, ANIMATION, COMEDY",
                "8.3",
                "2019",
                "1h 40m"
            )
        )
        movies.add(
            DataEntity(
                "m19",
                "John Wick: Chapter 3 – Parabellum",
                "Super-assassin John Wick returns with a $14 million price tag on his head and an army of bounty-hunting killers on his trail. After killing a member of the shadowy international assassin’s guild, the High Table, John Wick is excommunicado, but the world’s most ruthless hit men and women await his every turn.",
                "https://image.tmdb.org/t/p/w185/ziEuG1essDuWuC5lpWUaw1uXY2O.jpg",
                "CRIME, ACTION, THRILLER",
                "8.0",
                "2019",
                "2h 11m"
            )
        )

        return movies
    }

    fun generateDummyTv(): ArrayList<DataEntity> {
        val tvShows = ArrayList<DataEntity>()
        tvShows.add(
            DataEntity(
                "t10",
                "Gotham",
                "Before there was Batman, there was GOTHAM.Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                "https://image.tmdb.org/t/p/w185/4XddcRDtnNjYmLRMYpbrhFxsbuq.jpg",
                "DRAMA, FANTASY, CRIME",
                "7.9",
                "2019",
                "43m, 60m"
            )
        )
        tvShows.add(
            DataEntity(
                "t11",
                "Money Heist",
                "To carry out the biggest heist in history, a mysterious man called The Professor recruits a band of eight robbers who have a single characteristic: none of them has anything to lose. Five months of seclusion - memorizing every step, every detail, every probability - culminate in eleven days locked up in the National Coinage and Stamp Factory of Spain, surrounded by police forces and with dozens of hostages in their power, to find out whether their suicide wager will lead to everything or nothing.",
                "https://image.tmdb.org/t/p/w185/MoEKaPFHABtA1xKoOteirGaHl1.jpg",
                "CRIME, DRAMA",
                "8.6",
                "2017",
                "70m, 47m"
            )
        )
        tvShows.add(
            DataEntity(
                "t12",
                "The Flash",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only 'meta-human' who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "https://image.tmdb.org/t/p/w185/fki3kBlwJzFp8QohL43g9ReV455.jpg",
                "DRAMA, SCIFI & FANTASY",
                "7.8",
                "2014",
                "44m"
            )
        )
        tvShows.add(
            DataEntity(
                "t13",
                "Legion",
                "David Haller, AKA Legion, is a troubled young man who may be more than human. Diagnosed as schizophrenic, David has been in and out of psychiatric hospitals for years. But after a strange encounter with a fellow patient, he’s confronted with the possibility that the voices he hears and the visions he sees might be real.",
                "https://image.tmdb.org/t/p/w185/vT0Zsbm4GWd7llNjgWEtwY0CqOv.jpg",
                "ACTION & ADVENTURE, SCIFI & FANTASY",
                "8.3",
                "2017",
                "50m"
            )
        )
        tvShows.add(
            DataEntity(
                "t14",
                "Dragon Ball",
                "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the dragon balls brought her to Goku's home. Together, they set off to find all seven dragon balls in an adventure.",
                "https://image.tmdb.org/t/p/w185/3wx3EAMtqnbSLhGG8NrqXriCUIQ.jpg",
                "ACTION & ADVENTURE, SCIFI & FANTASY, ANIMATION",
                "8.5",
                "1986",
                "25m"
            )
        )
        tvShows.add(
            DataEntity(
                "t15",
                "One-Punch Man",
                "Saitama is a hero who only became a hero for fun. After three years of “special” training, though, he’s become so strong that he’s practically invincible. In fact, he’s too strong—even his mightiest opponents are taken out with a single punch, and it turns out that being devastatingly powerful is actually kind of a bore. With his passion for being a hero lost along with his hair, yet still faced with new enemies every day, how much longer can he keep it going?",
                "https://image.tmdb.org/t/p/w185/iE3s0lG5QVdEHOEZnoAxjmMtvne.jpg",
                "ACTION & ADVENTURE, COMEDY, ANIMATION",
                "8.9",
                "2015",
                "24m"
            )
        )
        tvShows.add(
            DataEntity(
                "36",
                "Family Guy",
                "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                "https://image.tmdb.org/t/p/w185/gBGUL1UTUNmdRQT8gA1LUV4yg39.jpg",
                "COMEDY , ANIMATION",
                "8.2",
                "1999",
                "22m"
            )
        )
        tvShows.add(
            DataEntity(
                "t17",
                "The 100",
                "100 years in the future, when the Earth has been abandoned due to radioactivity, the last surviving humans live on an ark orbiting the planet — but the ark won't last forever. So the repressive regime picks 100 expendable juvenile delinquents to send down to Earth to see if the planet is still habitable.",
                "https://image.tmdb.org/t/p/w185/wBzNjurA8ijJPF21Ggs9nbviIzi.jpg",
                "DRAMA, SCIFI & FANTASY",
                "7.7",
                "2014",
                "43m"
            )
        )
        tvShows.add(
            DataEntity(
                "t18",
                "The Simpsons",
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                "https://image.tmdb.org/t/p/w185/yTZQkSsxUFJZJe67IenRM0AEklc.jpg",
                "ANIMATION, COMEDY",
                "8.7",
                "1989",
                "22m"
            )
        )
        tvShows.add(
            DataEntity(
                "t19",
                "Pandora",
                "Set in the year 2199, a young woman who has lost everything finds a new life at Earth's Space Training Academy where she learns to defend the galaxy from intergalactic threats.",
                "https://image.tmdb.org/t/p/w185/tPsvhL45f1AjES5rycFIxnbaH8v.jpg",
                "ACTION & ADVENTURE, SCI-FI & FANTASY",
                "3.8",
                "2019",
                "42m"
            )
        )

        return tvShows
    }
}