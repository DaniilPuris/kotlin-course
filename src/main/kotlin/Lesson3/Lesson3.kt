package com.daniilpuris.Lessons

// Название мероприятия
var nameHackathonSurvival: String = "Name"

// Дата проведения
var dateHackathonSurvival: String = "00.00.00"

// Место проведения
var locationHackathonSurvival: String = "Adress"

// Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
var budgetEquipment: Int = 0
var budgetCatering: Int = 0
var budgetOperational: Int = 0

// Количество участников
var numberParticipants: Int = 0

// Длительность хакатона
var durationHackathonSurvival: Int = 0

// Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
var contactInfoFoodSuppliers: String = ""
var contactInfoEquipmentSuppliers: String = ""
var contactInfoServicesSuppliers: String = ""

var termsAgreementFoodSuppliers: String = ""
var termsAgreementEquipmentSuppliers: String = ""
var termsAgreementServicesSuppliers: String = ""

// Текущее состояние хакатона (статус)
var currentHackathonSurvivalStatus: String = "Не начался"

// Список спонсоров
var sponsors: MutableList<String> = mutableListOf("Sponsor1", "Sponsor2", "Sponsor3")

// Бюджет мероприятия
var eventBudget: Int = 0

// Текущий уровень доступа к интернету
var internetAccessLevel: Int = 0

// Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
var equipmentTransportation: String = ""
var resourcesAllocation: String = ""
var supportTeamsCoordination: String = ""

// Количество команд
var numberOfCommands: Int = 0

// Перечень задач
var tasksList: String = ""

// План эвакуации
val evacuationPlan: String = "Какой-то план"

// Список доступного оборудования
var availableEquipmentList: String = ""

// Список свободного оборудования
var listOfFreeEquipment: String = ""

// График питания участников (зависит от поставщика питания, определяемого за неделю до начала)

// План мероприятий на случай сбоев
val actionPlan: String = "Какой-то план"

// Список экспертов и жюри
var expertsAndJury: String = "Эксперты и жюри"

// Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
val anonymousSurveys: String = "Анонимные опросы"
var interviews: String = "Интервью"

// Политика конфиденциальности
val privacyPolicy: String = "Политика конфиденциальности"

// Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
private var privateReviews: String = "Приватные отзывы"

// Текущая температура в помещении
var roomTemperature: Byte = 25

// Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.


// Уровень освещения

// Лог событий мероприятия

// Доступность медицинской помощи

// Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
var planInCaseOfFailures: String = "Какой-то план"

// Регистрационный номер мероприятия

// Максимально допустимый уровень шума в помещении хакатона.

// Индикатор превышения уровня шума в помещениях

// Формат мероприятия (зависит от геополитической обстановки)

// Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.

// План взаимодействия с прессой

// Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.

// Статус получения всех необходимых разрешений

// Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)

// Список партнеров мероприятия

// Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.

// План распределения призов
val PrisePlan: String = "План распределения призов"

// Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.
private val emergencyServicesContacts: String = "Контакты"

// Особые условия для участников с ограниченными возможностями
val conditionsForParticipantsWithDisabilities: String = "Особые условия"

// Общее настроение участников (определяется опросами)
lateinit var participantsMood: String

// Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.

// Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.
lateinit var specialGuest: String

// Максимальное количество людей, которое может вместить место проведения.
val maximumPeople: Int = 100

// Стандартное количество часов, отведенное каждой команде для работы над проектом.
val timerForProject: Int = 72