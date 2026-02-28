package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Avalanche: ImageVector
    get() {
        val current = _avalanche
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Avalanche",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.06f, y = 15.58f)
                lineToRelative(dx = 5.61f, dy = -9.61f)
                arcToRelative(a = 0.45f, b = 0.45f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = -0.04f)
                lineToRelative(dx = 1.56f, dy = 2.09f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.09f, dy1 = 2.05f)
                lineToRelative(dx = -3.34f, dy = 5.35f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.54f, dy1 = 0.85f)
                horizontalLineTo(x = 6.45f)
                curveToRelative(dx1 = -0.35f, dy1 = -0.01f, dx2 = -0.57f, dy2 = -0.39f, dx3 = -0.39f, dy3 = -0.69f)
                moveToRelative(dx = 9.18f, dy = -3.21f)
                lineToRelative(dx = -1.92f, dy = 3.2f)
                arcToRelative(a = 0.46f, b = 0.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.39f, dy1 = 0.69f)
                horizontalLineToRelative(dx = 3.84f)
                arcToRelative(a = 0.46f, b = 0.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.39f, dy1 = -0.69f)
                lineToRelative(dx = -1.92f, dy = -3.2f)
                curveToRelative(dx1 = -0.17f, dy1 = -0.29f, dx2 = -0.6f, dy2 = -0.29f, dx3 = -0.78f, dy3 = 0.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.0f, y = 6.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 3.97f, dy1 = -3.15f)
            }
        }.build().also { _avalanche = it }
    }

@Suppress("ObjectPropertyName")
private var _avalanche: ImageVector? = null
