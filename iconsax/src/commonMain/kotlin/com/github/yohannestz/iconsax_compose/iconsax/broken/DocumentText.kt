package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentText: ImageVector
    get() {
        val current = _documentText
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DocumentText",
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
                moveTo(x = 12.0f, y = 13.0f)
                horizontalLineToRelative(dx = 1.0f)
                moveToRelative(dx = -6.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 2.45f)
                moveTo(x = 7.0f, y = 17.0f)
                horizontalLineToRelative(dx = 4.0f)
                moveTo(x = 2.0f, y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = 2.0f, dy2 = -7.0f, dx3 = 7.0f, dy3 = -7.0f)
                horizontalLineToRelative(dx = 5.0f)
                moveToRelative(dx = 8.0f, dy = 8.0f)
                verticalLineToRelative(dy = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = -2.0f, dy2 = 7.0f, dx3 = -7.0f, dy3 = 7.0f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.0f, dy1 = 0.0f, dx2 = -7.0f, dy2 = -2.0f, dx3 = -7.0f, dy3 = -7.0f)
                verticalLineToRelative(dy = -2.02f)
                moveTo(x = 18.0f, y = 10.0f)
                curveToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -4.0f, dy2 = -1.0f, dx3 = -4.0f, dy3 = -4.0f)
                verticalLineTo(y = 2.0f)
                lineToRelative(dx = 8.0f, dy = 8.0f)
            }
        }.build().also { _documentText = it }
    }

@Suppress("ObjectPropertyName")
private var _documentText: ImageVector? = null
