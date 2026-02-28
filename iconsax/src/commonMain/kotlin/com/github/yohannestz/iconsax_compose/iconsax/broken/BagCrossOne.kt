package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BagCrossOne: ImageVector
    get() {
        val current = _bagCrossOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BagCrossOne",
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
                moveTo(x = 12.0f, y = 19.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -8.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 8.0f)
                moveToRelative(dx = 1.07f, dy = -2.89f)
                lineTo(x = 10.95f, y = 14.0f)
                moveToRelative(dx = 2.1f, dy = 0.02f)
                lineToRelative(dx = -2.12f, dy = 2.12f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.81f, y = 16.56f)
                lineToRelative(dx = 0.23f, dy = 1.87f)
                curveTo(x1 = 4.26f, y1 = 20.39f, x2 = 4.98f, y2 = 22.0f, x3 = 9.0f, y3 = 22.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 4.02f, dy1 = 0.0f, dx2 = 4.74f, dy2 = -1.61f, dx3 = 4.95f, dy3 = -3.57f)
                lineToRelative(dx = 0.75f, dy = -6.0f)
                curveTo(x1 = 20.97f, y1 = 9.99f, x2 = 20.27f, y2 = 8.0f, x3 = 16.0f, y3 = 8.0f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -4.27f, dy1 = 0.0f, dx2 = -4.97f, dy2 = 1.99f, dx3 = -4.7f, dy3 = 4.43f)
                moveToRelative(dx = 4.2f, dy = -4.76f)
                verticalLineTo(y = 6.7f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.25f, dx2 = 1.81f, dy2 = -4.46f, dx3 = 4.06f, dy3 = -4.67f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.94f, dy1 = 4.48f)
                verticalLineToRelative(dy = 1.38f)
            }
        }.build().also { _bagCrossOne = it }
    }

@Suppress("ObjectPropertyName")
private var _bagCrossOne: ImageVector? = null
