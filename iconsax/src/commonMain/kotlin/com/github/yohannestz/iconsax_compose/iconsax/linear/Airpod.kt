package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Airpod: ImageVector
    get() {
        val current = _airpod
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Airpod",
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
                moveTo(x = 2.62f, y = 15.75f)
                verticalLineToRelative(dy = -7.5f)
                quadToRelative(dx1 = 0.0f, dy1 = -1.15f, dx2 = 0.11f, dy2 = -2.07f)
                curveTo(x1 = 3.1f, y1 = 2.89f, x2 = 4.65f, y2 = 2.0f, x3 = 8.88f, y3 = 2.0f)
                horizontalLineToRelative(dx = 6.25f)
                curveToRelative(dx1 = 4.22f, dy1 = 0.0f, dx2 = 5.78f, dy2 = 0.89f, dx3 = 6.14f, dy3 = 4.18f)
                arcToRelative(a = 15.0f, b = 15.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.11f, dy1 = 2.07f)
                verticalLineToRelative(dy = 7.5f)
                quadToRelative(dx1 = 0.0f, dy1 = 1.15f, dx2 = -0.11f, dy2 = 2.08f)
                curveTo(x1 = 20.9f, y1 = 21.11f, x2 = 19.35f, y2 = 22.0f, x3 = 15.12f, y3 = 22.0f)
                horizontalLineTo(x = 8.88f)
                curveToRelative(dx1 = -4.22f, dy1 = 0.0f, dx2 = -5.78f, dy2 = -0.89f, dx3 = -6.14f, dy3 = -4.17f)
                arcToRelative(a = 15.0f, b = 15.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.12f, dy1 = -2.08f)
                moveToRelative(dx = 18.61f, dy = -6.83f)
                horizontalLineToRelative(dx = -4.1f)
                moveToRelative(dx = -10.26f, dy = 0.0f)
                horizontalLineToRelative(dx = -4.1f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.13f, y = 8.92f)
                arcToRelative(a = 2.05f, b = 2.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.05f, dy1 = 2.05f)
                horizontalLineTo(x = 8.92f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.45f, dy1 = -0.61f)
                arcToRelative(a = 2.05f, b = 2.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.45f, dy1 = -3.49f)
                horizontalLineToRelative(dx = 6.15f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.45f, dy1 = 0.61f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.61f, dy1 = 1.44f)
            }
        }.build().also { _airpod = it }
    }

@Suppress("ObjectPropertyName")
private var _airpod: ImageVector? = null
