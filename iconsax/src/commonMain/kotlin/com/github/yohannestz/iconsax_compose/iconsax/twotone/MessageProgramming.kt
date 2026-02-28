package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageProgramming: ImageVector
    get() {
        val current = _messageProgramming
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessageProgramming",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.5f, y = 18.97f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -4.0f, dy1 = 0.0f, dx2 = -6.0f, dy2 = -1.0f, dx3 = -6.0f, dy3 = -6.0f)
                verticalLineToRelative(dy = -5.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -6.0f, dx2 = 6.0f, dy2 = -6.0f)
                horizontalLineToRelative(dx = 8.0f)
                quadToRelative(dx1 = 6.0f, dy1 = 0.0f, dx2 = 6.0f, dy2 = 6.0f)
                verticalLineToRelative(dy = 5.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 6.0f, dx2 = -6.0f, dy2 = 6.0f)
                horizontalLineToRelative(dx = -0.5f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.8f, dy1 = 0.4f)
                lineToRelative(dx = -1.5f, dy = 2.0f)
                curveToRelative(dx1 = -0.66f, dy1 = 0.88f, dx2 = -1.74f, dy2 = 0.88f, dx3 = -2.4f, dy3 = 0.0f)
                lineToRelative(dx = -1.5f, dy = -2.0f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.8f, dy1 = -0.4f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.0f, y = 8.7f)
                lineToRelative(dx = -2.0f, dy = 2.0f)
                lineToRelative(dx = 2.0f, dy = 2.0f)
                moveToRelative(dx = 8.0f, dy = -4.0f)
                lineToRelative(dx = 2.0f, dy = 2.0f)
                lineToRelative(dx = -2.0f, dy = 2.0f)
                moveToRelative(dx = -3.0f, dy = -4.33f)
                lineToRelative(dx = -2.0f, dy = 4.66f)
            }
        }.build().also { _messageProgramming = it }
    }

@Suppress("ObjectPropertyName")
private var _messageProgramming: ImageVector? = null
