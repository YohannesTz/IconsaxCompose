package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Moneys: ImageVector
    get() {
        val current = _moneys
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Moneys",
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
                moveTo(x = 19.3f, y = 7.92f)
                verticalLineToRelative(dy = 5.15f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.08f, dx2 = -1.76f, dy2 = 4.4f, dx3 = -4.4f, dy3 = 4.4f)
                horizontalLineTo(x = 6.11f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.99f, dy1 = -0.32f)
                curveToRelative(dx1 = -1.5f, dy1 = -0.56f, dx2 = -2.41f, dy2 = -1.86f, dx3 = -2.41f, dy3 = -4.08f)
                verticalLineTo(y = 7.92f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.08f, dx2 = 1.76f, dy2 = -4.4f, dx3 = 4.4f, dy3 = -4.4f)
                horizontalLineToRelative(dx = 8.79f)
                curveToRelative(dx1 = 2.24f, dy1 = 0.0f, dx2 = 3.85f, dy2 = 0.95f, dx3 = 4.28f, dy3 = 3.12f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.12f, dy1 = 1.28f)
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
                moveTo(x = 22.3f, y = 10.92f)
                verticalLineToRelative(dy = 5.15f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.08f, dx2 = -1.76f, dy2 = 4.4f, dx3 = -4.4f, dy3 = 4.4f)
                horizontalLineTo(x = 9.1f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.98f, dy1 = -0.32f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.3f, dy1 = -2.81f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.29f, dy1 = 0.13f)
                horizontalLineToRelative(dx = 8.79f)
                curveToRelative(dx1 = 2.64f, dy1 = 0.0f, dx2 = 4.4f, dy2 = -1.32f, dx3 = 4.4f, dy3 = -4.4f)
                verticalLineTo(y = 7.92f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.12f, dy1 = -1.28f)
                curveToRelative(dx1 = 1.9f, dy1 = 0.4f, dx2 = 3.12f, dy2 = 1.74f, dx3 = 3.12f, dy3 = 4.28f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.5f, y = 13.14f)
                arcToRelative(a = 2.64f, b = 2.64f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -5.28f)
                arcToRelative(a = 2.64f, b = 2.64f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 5.28f)
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
                moveTo(x = 4.78f, y = 8.3f)
                verticalLineToRelative(dy = 4.4f)
                moveToRelative(dx = 11.44f, dy = -4.4f)
                verticalLineToRelative(dy = 4.4f)
            }
        }.build().also { _moneys = it }
    }

@Suppress("ObjectPropertyName")
private var _moneys: ImageVector? = null
