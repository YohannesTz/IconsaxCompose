package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TimerStart: ImageVector
    get() {
        val current = _timerStart
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TimerStart",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 8.0f)
                verticalLineToRelative(dy = 5.0f)
                moveTo(x = 8.01f, y = 5.46f)
                arcToRelative(a = 8.77f, b = 8.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 12.74f, dy1 = 7.79f)
                moveTo(x = 12.0f, y = 22.0f)
                arcTo(horizontalEllipseRadius = 8.75f, verticalEllipseRadius = 8.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.01f, y1 = 7.99f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.0f, y = 2.0f)
                horizontalLineToRelative(dx = 6.0f)
                moveToRelative(dx = -0.1f, dy = 16.5f)
                verticalLineToRelative(dy = -1.16f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.43f, dx2 = 1.02f, dy2 = -2.02f, dx3 = 2.26f, dy3 = -1.3f)
                lineToRelative(dx = 1.0f, dy = 0.58f)
                lineToRelative(dx = 1.0f, dy = 0.58f)
                curveToRelative(dx1 = 1.24f, dy1 = 0.72f, dx2 = 1.24f, dy2 = 1.9f, dx3 = 0.0f, dy3 = 2.61f)
                lineToRelative(dx = -1.0f, dy = 0.58f)
                lineToRelative(dx = -1.0f, dy = 0.58f)
                curveToRelative(dx1 = -1.24f, dy1 = 0.72f, dx2 = -2.26f, dy2 = 0.13f, dx3 = -2.26f, dy3 = -1.3f)
                close()
            }
        }.build().also { _timerStart = it }
    }

@Suppress("ObjectPropertyName")
private var _timerStart: ImageVector? = null
