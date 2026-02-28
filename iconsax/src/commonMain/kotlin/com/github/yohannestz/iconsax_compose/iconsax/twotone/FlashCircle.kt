package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlashCircle: ImageVector
    get() {
        val current = _flashCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FlashCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.68f, y = 12.72f)
                horizontalLineToRelative(dx = 1.74f)
                verticalLineToRelative(dy = 4.05f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.6f, dx2 = 0.74f, dy2 = 0.88f, dx3 = 1.14f, dy3 = 0.43f)
                lineToRelative(dx = 4.26f, dy = -4.84f)
                arcToRelative(a = 0.65f, b = 0.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.49f, dy1 = -1.08f)
                horizontalLineToRelative(dx = -1.74f)
                verticalLineTo(y = 7.23f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.6f, dx2 = -0.74f, dy2 = -0.88f, dx3 = -1.14f, dy3 = -0.43f)
                lineToRelative(dx = -4.26f, dy = 4.84f)
                arcToRelative(a = 0.65f, b = 0.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.49f, dy1 = 1.08f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.97f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
        }.build().also { _flashCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _flashCircle: ImageVector? = null
