package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CardRemove: ImageVector
    get() {
        val current = _cardRemove
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CardRemove",
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
                moveTo(x = 1.9f, y = 10.03f)
                horizontalLineToRelative(dx = 20.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.46f, y = 20.53f)
                horizontalLineTo(x = 6.35f)
                curveToRelative(dx1 = -3.55f, dy1 = 0.0f, dx2 = -4.45f, dy2 = -0.88f, dx3 = -4.45f, dy3 = -4.39f)
                verticalLineTo(y = 7.92f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.18f, dx2 = 0.74f, dy2 = -4.2f, dx3 = 3.53f, dy3 = -4.36f)
                lineToRelative(dx = 0.92f, dy = -0.02f)
                horizontalLineToRelative(dx = 11.1f)
                curveToRelative(dx1 = 3.56f, dy1 = 0.0f, dx2 = 4.46f, dy2 = 0.88f, dx3 = 4.46f, dy3 = 4.39f)
                verticalLineToRelative(dy = 4.41f)
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
                moveTo(x = 17.9f, y = 22.03f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -8.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 8.0f)
                moveToRelative(dx = 1.07f, dy = -2.88f)
                lineToRelative(dx = -2.11f, dy = -2.12f)
                moveToRelative(dx = 2.09f, dy = 0.03f)
                lineToRelative(dx = -2.12f, dy = 2.11f)
                moveTo(x = 5.9f, y = 16.03f)
                horizontalLineToRelative(dx = 4.0f)
            }
        }.build().also { _cardRemove = it }
    }

@Suppress("ObjectPropertyName")
private var _cardRemove: ImageVector? = null
