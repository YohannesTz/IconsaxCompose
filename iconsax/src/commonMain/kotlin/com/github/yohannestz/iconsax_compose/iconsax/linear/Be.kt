package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Be: ImageVector
    get() {
        val current = _be
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Be",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 12.0f)
                horizontalLineToRelative(dx = 7.0f)
                curveToRelative(dx1 = 1.7f, dy1 = 0.0f, dx2 = 3.0f, dy2 = 1.3f, dx3 = 3.0f, dy3 = 3.0f)
                reflectiveCurveToRelative(dx1 = -1.3f, dy1 = 3.0f, dx2 = -3.0f, dy2 = 3.0f)
                horizontalLineTo(x = 3.0f)
                curveToRelative(dx1 = -0.6f, dy1 = 0.0f, dx2 = -1.0f, dy2 = -0.4f, dx3 = -1.0f, dy3 = -1.0f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.6f, dx2 = 0.4f, dy2 = -1.0f, dx3 = 1.0f, dy3 = -1.0f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 1.7f, dy1 = 0.0f, dx2 = 3.0f, dy2 = 1.3f, dx3 = 3.0f, dy3 = 3.0f)
                reflectiveCurveToRelative(dx1 = -1.3f, dy1 = 3.0f, dx2 = -3.0f, dy2 = 3.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.0f, y = 14.0f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.2f, dx2 = -1.8f, dy2 = -4.0f, dx3 = -4.0f, dy3 = -4.0f)
                reflectiveCurveToRelative(dx1 = -4.0f, dy1 = 1.8f, dx2 = -4.0f, dy2 = 4.0f)
                moveToRelative(dx = 0.0f, dy = 0.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.2f, dx2 = 1.8f, dy2 = 4.0f, dx3 = 4.0f, dy3 = 4.0f)
                horizontalLineToRelative(dx = 1.7f)
                moveTo(x = 19.5f, y = 7.5f)
                horizontalLineToRelative(dx = -3.0f)
            }
        }.build().also { _be = it }
    }

@Suppress("ObjectPropertyName")
private var _be: ImageVector? = null
