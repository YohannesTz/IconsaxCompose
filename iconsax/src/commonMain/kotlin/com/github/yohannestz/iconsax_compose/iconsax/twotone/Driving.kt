package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Driving: ImageVector
    get() {
        val current = _driving
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Driving",
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
                moveTo(x = 14.55f, y = 2.0f)
                horizontalLineToRelative(dx = -5.1f)
                curveToRelative(dx1 = -1.8f, dy1 = 0.0f, dx2 = -2.2f, dy2 = 0.9f, dx3 = -2.43f, dy3 = 2.01f)
                lineTo(x = 6.2f, y = 7.93f)
                horizontalLineToRelative(dx = 11.6f)
                lineToRelative(dx = -0.82f, dy = -3.92f)
                curveTo(x1 = 16.75f, y1 = 2.9f, x2 = 16.35f, y2 = 2.0f, x3 = 14.55f, y3 = 2.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.24f, y = 14.32f)
                arcToRelative(a = 1.46f, b = 1.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.47f, dy1 = 1.58f)
                horizontalLineTo(x = 16.4f)
                curveToRelative(dx1 = -0.78f, dy1 = 0.0f, dx2 = -0.9f, dy2 = -0.33f, dx3 = -1.03f, dy3 = -0.75f)
                lineToRelative(dx = -0.15f, dy = -0.43f)
                curveToRelative(dx1 = -0.2f, dy1 = -0.59f, dx2 = -0.33f, dy2 = -0.99f, dx3 = -1.38f, dy3 = -0.99f)
                horizontalLineToRelative(dx = -3.71f)
                curveToRelative(dx1 = -1.04f, dy1 = 0.0f, dx2 = -1.2f, dy2 = 0.45f, dx3 = -1.38f, dy3 = 1.0f)
                lineTo(x = 8.6f, y = 15.14f)
                curveToRelative(dx1 = -0.14f, dy1 = 0.41f, dx2 = -0.25f, dy2 = 0.75f, dx3 = -1.03f, dy3 = 0.75f)
                horizontalLineTo(x = 6.22f)
                arcToRelative(a = 1.46f, b = 1.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.47f, dy1 = -1.58f)
                lineToRelative(dx = 0.4f, dy = -4.42f)
                curveToRelative(dx1 = 0.1f, dy1 = -1.09f, dx2 = 0.32f, dy2 = -1.98f, dx3 = 2.22f, dy3 = -1.98f)
                horizontalLineToRelative(dx = 9.25f)
                curveToRelative(dx1 = 1.9f, dy1 = 0.0f, dx2 = 2.1f, dy2 = 0.9f, dx3 = 2.2f, dy3 = 1.98f)
                close()
                moveTo(x = 6.2f, y = 5.75f)
                horizontalLineTo(x = 5.47f)
                moveToRelative(dx = 13.06f, dy = 0.0f)
                horizontalLineTo(x = 17.8f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.65f, y = 10.83f)
                horizontalLineToRelative(dx = 2.17f)
                moveToRelative(dx = 4.36f, dy = 0.0f)
                horizontalLineToRelative(dx = 2.17f)
                moveTo(x = 12.0f, y = 17.0f)
                verticalLineToRelative(dy = 1.0f)
                moveToRelative(dx = 0.0f, dy = 3.0f)
                verticalLineToRelative(dy = 1.0f)
                moveToRelative(dx = -9.0f, dy = -4.0f)
                lineToRelative(dx = -1.0f, dy = 4.0f)
                moveToRelative(dx = 19.0f, dy = -4.0f)
                lineToRelative(dx = 1.0f, dy = 4.0f)
            }
        }.build().also { _driving = it }
    }

@Suppress("ObjectPropertyName")
private var _driving: ImageVector? = null
