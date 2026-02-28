package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Icon: ImageVector
    get() {
        val current = _icon
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Icon",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 3.0f,
            ) {
                moveTo(x = 20.2f, y = 3.8f)
                horizontalLineToRelative(dx = 0.1f)
                moveTo(x = 3.7f, y = 20.2f)
                horizontalLineToRelative(dx = 0.1f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.6f, y = 6.0f)
                curveToRelative(dx1 = -1.1f, dy1 = -0.6f, dx2 = -2.3f, dy2 = -1.0f, dx3 = -3.6f, dy3 = -1.0f)
                curveToRelative(dx1 = -3.9f, dy1 = 0.0f, dx2 = -7.0f, dy2 = 3.1f, dx3 = -7.0f, dy3 = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.3f, dx2 = 0.4f, dy2 = 2.6f, dx3 = 1.0f, dy3 = 3.7f)
                moveTo(x = 8.3f, y = 18.0f)
                curveToRelative(dx1 = 1.1f, dy1 = 0.7f, dx2 = 2.3f, dy2 = 1.0f, dx3 = 3.7f, dy3 = 1.0f)
                curveToRelative(dx1 = 3.9f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -3.1f, dx3 = 7.0f, dy3 = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.3f, dx2 = -0.4f, dy2 = -2.6f, dx3 = -1.0f, dy3 = -3.7f)
            }
        }.build().also { _icon = it }
    }

@Suppress("ObjectPropertyName")
private var _icon: ImageVector? = null
