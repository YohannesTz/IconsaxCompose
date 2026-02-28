package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BoxOne: ImageVector
    get() {
        val current = _boxOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BoxOne",
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
                moveTo(x = 3.17f, y = 7.44f)
                lineTo(x = 12.0f, y = 12.55f)
                lineToRelative(dx = 8.77f, dy = -5.08f)
                moveTo(x = 12.0f, y = 21.61f)
                verticalLineToRelative(dy = -9.07f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.93f, y = 2.48f)
                lineTo(x = 4.59f, y = 5.44f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.2f, dy1 = 3.73f)
                verticalLineToRelative(dy = 5.65f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.2f, dy1 = 3.73f)
                lineToRelative(dx = 5.34f, dy = 2.97f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.15f, dy1 = 0.0f)
                lineToRelative(dx = 5.34f, dy = -2.97f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.2f, dy1 = -3.73f)
                verticalLineTo(y = 9.17f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.2f, dy1 = -3.73f)
                lineToRelative(dx = -5.34f, dy = -2.97f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.15f, dy1 = 0.01f)
            }
        }.build().also { _boxOne = it }
    }

@Suppress("ObjectPropertyName")
private var _boxOne: ImageVector? = null
